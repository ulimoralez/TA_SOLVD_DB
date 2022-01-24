package jdbc.dao;

import entities.Hosting;
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

public class ImpHosting implements IDAO< Hosting >{
	private final Logger LOGGER = Logger.getLogger( ImpHosting.class.getName( ) );
	private final String tableName = "hosting";
	//SQL QUERIES - PreparedStatement
	private final String GET = "SELECT * FROM " + tableName + " WHERE " + tableName + "Id=?";
	private final String GETALL = "SELECT * FROM " + tableName;
	private final String INSERT = "INSERT INTO " + tableName + " ( name, maximum_storage_gb, plans) " +
			"VALUES (?, ?, ?)";
	private final String UPDATE =
			"UPDATE " + tableName + " SET name=?, maximum_storage_gb=?, plans=? WHERE" +
					" " + tableName +
					"Id=?";
	private final String DELETE = "DELETE FROM " + tableName + " WHERE " + tableName + "Id=?";
	ArrayList< Hosting > getAllResponse = new ArrayList<>( );
	private Connection dbconnection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private Hosting getObject;
	private Optional< Hosting > getResponse = Optional.empty( );
	
	@Override
	public Optional< Hosting > get( int id ){
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
	public List< Hosting > getAll( ){
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
	public void save( Hosting hosting ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( INSERT, PreparedStatement.RETURN_GENERATED_KEYS );
			preparedStatement.setString( 1, hosting.getName( ) );
			preparedStatement.setInt( 2, hosting.getMaximumStorageGB( ) );
			preparedStatement.setString( 3, hosting.getPlans( ) );
			
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void update( Hosting hosting ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( UPDATE );
			preparedStatement.setString( 1, hosting.getName( ) );
			preparedStatement.setInt( 2, hosting.getMaximumStorageGB( ) );
			preparedStatement.setString( 3, hosting.getPlans( ) );
			preparedStatement.setInt( 4, hosting.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
			
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void delete( Hosting hosting ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( DELETE );
			preparedStatement.setInt( 1, hosting.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	private Hosting createObject( ResultSet resultSet ) throws SQLException{
		//int videoId, String name, int maximumStorageGB, String plans
		Hosting hosting = new Hosting( );
		hosting.setId( resultSet.getInt( 1 ) );
		hosting.setName( resultSet.getString( 2 ) );
		hosting.setMaximumStorageGB( resultSet.getInt( 3 ) );
		hosting.setPlans( resultSet.getString( 4 ) );
		return hosting;
	}
}
