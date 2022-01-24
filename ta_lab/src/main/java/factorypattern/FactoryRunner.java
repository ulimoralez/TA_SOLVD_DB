package factorypattern;

import java.util.logging.Logger;

public class FactoryRunner{
	public static void main( String[] args ){
		Logger LOGGER = Logger.getLogger( FactoryRunner.class.getName( ) );
		PeopleFactory peopleFactory = new PeopleFactory( );
		IPeople student = peopleFactory.getPeople( "Student" );
		LOGGER.info( "Is student? " + student.isStudent( ) );
		LOGGER.info( "Is Professor?" + student.isProfessor( ) );
		
		IPeople professor = peopleFactory.getPeople( "Professor" );
		LOGGER.info( "Is Professor?" + professor.isProfessor( ) );
		LOGGER.info( "Is student? " + professor.isStudent( ) );
	}
}
