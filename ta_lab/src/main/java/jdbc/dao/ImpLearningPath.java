package jdbc.dao;

import entities.LearningPath;
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

public class ImpLearningPath implements IDAO< LearningPath >{
	
	private final Logger LOGGER = Logger.getLogger( ImpLearningPath.class.getName( ) );
	private final String tableName = "learningpath";
	//SQL QUERIES - PreparedStatement
	private final String GET = "SELECT * FROM " + tableName + " WHERE " + tableName + "Id=?";
	private final String GETALL = "SELECT * FROM " + tableName;
	private final String INSERT = "INSERT INTO " + tableName + " ( name, description, creation_date) " +
			"VALUES (?, ?, ?)";
	private final String UPDATE =
			"UPDATE " + tableName + " SET name=?, description=?, creation_date=? WHERE" +
					" " + tableName +
					"Id=?";
	private final String DELETE = "DELETE FROM " + tableName + " WHERE " + tableName + "Id=?";
	ArrayList< LearningPath > getAllResponse = new ArrayList<>( );
	private Connection dbconnection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	//Change class
	private LearningPath getObject;
	private Optional< LearningPath > getResponse = Optional.empty( );
	
	@Override
	public Optional< LearningPath > get( int id ){
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
	public List< LearningPath > getAll( ){
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
	public void save( LearningPath learningPath ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( INSERT, PreparedStatement.RETURN_GENERATED_KEYS );
			preparedStatement.setString( 1, learningPath.getName( ) );
			preparedStatement.setString( 2, learningPath.getDescription( ) );
			preparedStatement.setTimestamp( 3, learningPath.getCreationDate( ) );
			
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void update( LearningPath learningPath ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( UPDATE );
			preparedStatement.setString( 1, learningPath.getName( ) );
			preparedStatement.setString( 2, learningPath.getDescription( ) );
			preparedStatement.setTimestamp( 3, learningPath.getCreationDate( ) );
			preparedStatement.setInt( 4, learningPath.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
			
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void delete( LearningPath learningPath ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( DELETE );
			preparedStatement.setInt( 1, learningPath.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	private LearningPath createObject( ResultSet resultSet ) throws SQLException{
		LearningPath learningPath = new LearningPath( );
		learningPath.setId( resultSet.getInt( 1 ) );
		learningPath.setName( resultSet.getString( 2 ) );
		learningPath.setDescription( resultSet.getString( 3 ) );
		learningPath.setCreationDate( resultSet.getTimestamp( 4 ) );
		return learningPath;
	}
}
