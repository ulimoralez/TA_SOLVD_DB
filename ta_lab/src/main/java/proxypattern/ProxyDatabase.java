package proxypattern;

import jdbc.connection.DBConnection;

import java.util.logging.Logger;

public class ProxyDatabase implements ITestConnectionDB{
	private final Logger LOGGER = Logger.getLogger( ProxyDatabase.class.getName( ) );
	private DBConnection dbConnection;
	private String connectionName;
	
	public ProxyDatabase( String connectionName ){
		this.connectionName = connectionName;
		initializingDbConnection( connectionName );
	}
	
	private void initializingDbConnection( String connectionName ){
		LOGGER.info( "Initializing database " + connectionName );
	}
	
	@Override
	public void ping( ){
		if( dbConnection == null ){
			dbConnection = new DBConnection( );
		}
		dbConnection.ping( );
	}
}
