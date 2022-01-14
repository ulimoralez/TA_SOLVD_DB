import entities.Category;
import org.xml.sax.SAXException;
import xml.service.stax.Stax;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.ArrayList;

public class StaxRunner{
	public static void main( String[] args ){
		String xmlCategoryPath = "src/main/resources/xml/Category/category.xml";
		String xsdCategoryPath = "src/main/resources/xml/Category/category.xsd";
		
		try{
			Stax stax = new Stax( xmlCategoryPath, xsdCategoryPath );
			stax.validateXML( );
			ArrayList< Category > categories = new ArrayList<>( stax.parseXMLCategory( ) );
			System.out.println( categories );
		}catch( XMLStreamException | SAXException | IOException e ){
			e.printStackTrace( );
		}
	}
}
