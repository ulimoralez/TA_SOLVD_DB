package jdbc.connection;

import proxypattern.ITestConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBConnection implements ITestConnectionDB{
	private final Logger LOGGER = Logger.getLogger( DBConnection.class.getName( ) );
	
	private String url = "jdbc:mysql://127.0.0.1:3306/ta_lab";
	private String username = "root";
	private String password = "43346918Uli";
	
	public DBConnection( ){
	
	}
	
	public DBConnection( String url, String username, String password ){
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public String getUrl( ){
		return url;
	}
	
	public void setHost( String url ){
		this.url = url;
	}
	
	public String getUsername( ){
		return username;
	}
	
	public void setUsername( String username ){
		this.username = username;
	}
	
	public String getPassword( ){
		return password;
	}
	
	public void setPassword( String password ){
		this.password = password;
	}
	
	public Connection getConnetion( ){
		Connection connection = null;
		try{
			connection = DriverManager.getConnection( url, username, password );
		}catch( SQLException e ){
			e.printStackTrace( );
		}
		return connection;
	}
	
	@Override
	public void ping( ){
		Connection connection = null;
		LOGGER.info( "Ping to Database! - 89ms" );
	}
}
