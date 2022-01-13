import domain.Category;
import jakarta.xml.bind.JAXBException;
import utils.xml.jaxb.Jaxb;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

public class JaxbRunner{
	public static void main( String[] args ) throws JAXBException, FileNotFoundException{
		Logger LOGGER = Logger.getLogger( JaxbRunner.class.getName( ) );
		
		Category category = new Category( 1, "Programming", "Courses about programming" );
		Category categoryUnmarshalled = new Category( );
		
		String categoryXMLpath = "src/main/resources/jaxbxml/category/category.xml";
		
		Jaxb< Category > categoryJaxb = new Jaxb<>( );
		
		categoryJaxb.marshall( category, categoryXMLpath );
		LOGGER.info( "Marshall executed" );
		
		categoryUnmarshalled = categoryJaxb.unmarshall( categoryUnmarshalled, categoryXMLpath );
		LOGGER.info( "Unmarshall executed, object created: " + categoryUnmarshalled );
	}
}
