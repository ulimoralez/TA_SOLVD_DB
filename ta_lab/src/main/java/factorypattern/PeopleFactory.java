package factorypattern;

import entities.Professor;
import entities.Student;

import java.util.Locale;

public class PeopleFactory{
	
	public IPeople getPeople( String peopleType ){
		if( peopleType == null ){
			return null;
		}
		if( peopleType.toLowerCase( Locale.ROOT ).equalsIgnoreCase( "student" ) ){
			return new Student( );
		}
		if( peopleType.toLowerCase( Locale.ROOT ).equalsIgnoreCase( "professor" ) ){
			return new Professor( );
		}
		return null;
	}
}
