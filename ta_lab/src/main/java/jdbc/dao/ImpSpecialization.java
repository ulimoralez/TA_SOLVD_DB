package jdbc.dao;

import entities.Specialization;
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

public class ImpSpecialization implements IDAO< Specialization >{
	private final Logger LOGGER = Logger.getLogger( ImpSpecialization.class.getName( ) );
	private final String tableName = "specialization";
	//SQL QUERIES - PreparedStatement
	private final String GET = "SELECT * FROM " + tableName + " WHERE " + tableName + "Id=?";
	private final String GETALL = "SELECT * FROM " + tableName;
	private final String INSERT = "INSERT INTO " + tableName + " ( name, description, foundation_age) " +
			"VALUES (?, ?, ?)";
	private final String UPDATE =
			"UPDATE " + tableName + " SET name=?, description=?, foundation_age=? WHERE" +
					" " + tableName +
					"Id=?";
	private final String DELETE = "DELETE FROM " + tableName + " WHERE " + tableName + "Id=?";
	ArrayList< Specialization > getAllResponse = new ArrayList<>( );
	private Connection dbconnection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	//Change class
	private Specialization getObject;
	private Optional< Specialization > getResponse = Optional.empty( );
	
	@Override
	public Optional< Specialization > get( int id ){
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
	public List< Specialization > getAll( ){
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
	public void save( Specialization specialization ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( INSERT, PreparedStatement.RETURN_GENERATED_KEYS );
			preparedStatement.setString( 1, specialization.getName( ) );
			preparedStatement.setString( 2, specialization.getDescription( ) );
			preparedStatement.setTimestamp( 3, specialization.getFoundationAge( ) );
			
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void update( Specialization specialization ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( UPDATE );
			preparedStatement.setString( 1, specialization.getName( ) );
			preparedStatement.setString( 2, specialization.getDescription( ) );
			preparedStatement.setTimestamp( 3, specialization.getFoundationAge( ) );
			preparedStatement.setInt( 4, specialization.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
			
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void delete( Specialization specialization ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( DELETE );
			preparedStatement.setInt( 1, specialization.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	private Specialization createObject( ResultSet resultSet ) throws SQLException{
		Specialization specialization = new Specialization( );
		specialization.setId( resultSet.getInt( 1 ) );
		specialization.setName( resultSet.getString( 2 ) );
		specialization.setDescription( resultSet.getString( 3 ) );
		specialization.setFoundationAge( resultSet.getTimestamp( 4 ) );
		return specialization;
	}
}
