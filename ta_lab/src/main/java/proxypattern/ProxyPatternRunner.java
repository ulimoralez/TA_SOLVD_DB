package proxypattern;

public class ProxyPatternRunner{
	public static void main( String[] args ){
		ITestConnectionDB dbConnection = new ProxyDatabase( "First Connection" );
		dbConnection.ping( );
		dbConnection.ping( );
	}
}
