package jdbc.dao;

import entities.Professor;
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

public class ImpProfessor implements IDAO< Professor >{
	private final Logger LOGGER = Logger.getLogger( ImpProfessor.class.getName( ) );
	private final String tableName = "professor";
	
	//SQL QUERIES - PreparedStatement
	private final String GET = "SELECT * FROM " + tableName + " WHERE " + tableName + "Id=?";
	private final String GETALL = "SELECT * FROM " + tableName;
	private final String INSERT = "INSERT INTO " + tableName + " ( specializationId, firstname, lastname, " +
			"age) " +
			"VALUES (?, ?, ?, ?)";
	private final String UPDATE =
			"UPDATE " + tableName + " SET specializationId=?, firstname=?, lastname=?, age=? WHERE" +
					" " + tableName +
					"Id=?";
	private final String DELETE = "DELETE FROM " + tableName + " WHERE " + tableName + "Id=?";
	ArrayList< Professor > getAllResponse = new ArrayList<>( );
	private Connection dbconnection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	//Change class
	private Professor getObject;
	private Optional< Professor > getResponse = Optional.empty( );
	
	@Override
	public Optional< Professor > get( int id ){
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
	public List< Professor > getAll( ){
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
	public void save( Professor professor ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( INSERT, PreparedStatement.RETURN_GENERATED_KEYS );
			preparedStatement.setInt( 1, professor.getSpecializationId( ) );
			preparedStatement.setString( 2, professor.getFirstname( ) );
			preparedStatement.setString( 3, professor.getLastname( ) );
			preparedStatement.setInt( 4, professor.getAge( ) );
			
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void update( Professor professor ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( UPDATE );
			preparedStatement.setInt( 1, professor.getSpecializationId( ) );
			preparedStatement.setString( 2, professor.getFirstname( ) );
			preparedStatement.setString( 3, professor.getLastname( ) );
			preparedStatement.setInt( 4, professor.getAge( ) );
			preparedStatement.setInt( 5, professor.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
			
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void delete( Professor professor ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( DELETE );
			preparedStatement.setInt( 1, professor.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	private Professor createObject( ResultSet resultSet ) throws SQLException{
		Professor professor = new Professor( );
		professor.setId( resultSet.getInt( 1 ) );
		professor.setSpecializationId( resultSet.getInt( 2 ) );
		professor.setFirstname( resultSet.getString( 3 ) );
		professor.setLastname( resultSet.getString( 4 ) );
		professor.setAge( resultSet.getInt( 5 ) );
		return professor;
	}
}
