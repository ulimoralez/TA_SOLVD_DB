package implementation;

import connection.DBConnection;
import domain.Category;
import interfaces.IDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class ImpCategory implements IDAO< Category >{
	
	//SQL QUERIES - PreparedStatement
	private static final String GET = "SELECT * FROM category WHERE categoryId=?";
	private static final String GETALL = "SELECT * FROM category ";
	private static final String INSERT = "INSERT INTO category (name, description) VALUES (?, ?)";
	private static final String UPDATE = "UPDATE category SET name=?, description=? WHERE categoryId=?";
	private static final String DELETE = "DELETE FROM category WHERE categoryId=?";
	private final Logger LOGGER = Logger.getLogger( ImpCategory.class.getName( ) );
	private Connection dbconnection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private Category category;
	
	@Override
	public Optional< Category > get( int id ){
		dbconnection = new DBConnection( ).getConnetion( );
		Optional< Category > result = Optional.empty( );
		try{
			preparedStatement = dbconnection.prepareStatement( GET );
			preparedStatement.setInt( 1, id );
			resultSet = preparedStatement.executeQuery( );
			
			if( resultSet.next( ) ){
				category = createCategory( resultSet );
			}
			
			result = Optional.of( category );
			
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
		return result;
	}
	
	@Override
	public List< Category > getAll( ){
		ArrayList< Category > categories = new ArrayList<>( );
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( GETALL );
			resultSet = preparedStatement.executeQuery( );
			while( resultSet.next( ) ){
				categories.add( createCategory( resultSet ) );
			}
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
		return categories;
	}
	
	@Override
	public void save( Category category ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( INSERT, PreparedStatement.RETURN_GENERATED_KEYS );
			preparedStatement.setString( 1, category.getName( ) );
			preparedStatement.setString( 2, category.getDescription( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void update( Category category ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( UPDATE );
			preparedStatement.setString( 1, category.getName( ) );
			preparedStatement.setString( 2, category.getDescription( ) );
			preparedStatement.setInt( 3, category.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
			
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	@Override
	public void delete( Category category ){
		dbconnection = new DBConnection( ).getConnetion( );
		try{
			preparedStatement = dbconnection.prepareStatement( DELETE );
			preparedStatement.setInt( 1, category.getId( ) );
			preparedStatement.executeUpdate( );
			preparedStatement.close( );
			dbconnection.close( );
		}catch( SQLException throwables ){
			LOGGER.severe( throwables.getMessage( ) );
			throwables.printStackTrace( );
		}
	}
	
	private Category createCategory( ResultSet resultSet ) throws SQLException{
		return new Category( resultSet.getInt( 1 ), resultSet.getString( 2 ), resultSet.getString( 3 ) );
	}
}
