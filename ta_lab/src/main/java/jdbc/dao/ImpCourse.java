package jdbc.dao;

import entities.Course;
import jdbc.connection.DBConnection;
import services.interfaces.IDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class ImpCourse implements IDAO< Course >{
	private final Logger LOGGER = Logger.getLogger( ImpCourse.class.getName( ) );
	private final String tableName = "course";
	//SQL QUERIES - PreparedStatement
	private final String GET = "SELECT * FROM " + tableName + " WHERE " + tableName + "Id=?";
	private final String GETALL = "SELECT * FROM " + tableName;
	private final String INSERT = "INSERT INTO " + tableName + " (learningpathid, name, description, duration_hs, " +
			"creation_date) " +
			"VALUES (?, ?, ?, ?, ?)";
	private final String UPDATE =
			"UPDATE " + tableName + " SET learningpathid=?, name=?, description=?, duration_hs=? WHERE" +
					" " + tableName +
					"Id=?";
	private final String DELETE = "DELETE FROM " + tableName + " WHERE " + tableName + "Id=?";
	ArrayList< Course > getAllResponse = new ArrayList<>( );
	private Connection dbconnection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private Course getObject;
	private Optional< Course > getResponse = Optional.empty( );
	
	@Override
	public Optional< Course > get( int id ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( GET );
			preparedStatement.setInt( 1, id );
			resultSet = preparedStatement.executeQuery( );
			
			if( resultSet.next( ) ){
				getObject = createObject( resultSet );
			}
			
			getResponse = Optional.ofNullable( getObject );
			
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
		return getResponse;
	}
	
	@Override
	public List< Course > getAll( ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( GETALL );
			resultSet = preparedStatement.executeQuery( );
			while( resultSet.next( ) ){
				getAllResponse.add( createObject( resultSet ) );
			}
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
		return getAllResponse;
	}
	
	@Override
	public void save( Course course ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( INSERT, PreparedStatement.RETURN_GENERATED_KEYS );
			preparedStatement.setInt( 1, course.getLearningPathId( ) );
			preparedStatement.setString( 2, course.getName( ) );
			preparedStatement.setString( 3, course.getDescription( ) );
			preparedStatement.setFloat( 4, course.getDurationHS( ) );
			preparedStatement.setInt( 5, course.getId( ) );
			
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void update( Course course ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( UPDATE );
			preparedStatement.setInt( 1, course.getLearningPathId( ) );
			preparedStatement.setString( 2, course.getName( ) );
			preparedStatement.setString( 3, course.getDescription( ) );
			preparedStatement.setFloat( 4, course.getDurationHS( ) );
			preparedStatement.setInt( 5, course.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
			
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void delete( Course course ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( DELETE );
			preparedStatement.setInt( 1, course.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	private Course createObject( ResultSet resultSet ) throws SQLException{
		int courseId = resultSet.getInt( 1 );
		int learningPathId = resultSet.getInt( 2 );
		int videoId = 0;
		String name = resultSet.getString( 3 );
		String desc = resultSet.getString( 4 );
		int duration_hs = resultSet.getInt( 5 );
		
		return new Course( courseId, learningPathId, videoId,
				name, desc, duration_hs );
	}
}
