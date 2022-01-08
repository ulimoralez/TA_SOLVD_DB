package utils.xml.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Jaxb< T >{
	private JAXBContext context;
	
	public void marshall( T t, String xmlPath ) throws JAXBException{
		context = JAXBContext.newInstance( t.getClass( ) );
		Marshaller marshaller = context.createMarshaller( );
		marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
		marshaller.marshal( t, new File( xmlPath ) );
	}
	
	public T unmarshall( T t, String xmlPath ) throws JAXBException, FileNotFoundException{
		context = JAXBContext.newInstance( t.getClass( ) );
		return ( T ) context.createUnmarshaller( ).unmarshal( new FileReader( xmlPath ) );
	}
}
