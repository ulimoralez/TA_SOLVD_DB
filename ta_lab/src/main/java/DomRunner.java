import org.xml.sax.SAXException;
import utils.xml.dom.Dom;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.logging.Logger;

public class DomRunner{
	public static void main( String[] args ){
		Logger LOGGER = Logger.getLogger( DomRunner.class.getName() );
		Dom dom = new Dom();
		try{
			dom.parseCollegeXML();
		}catch( ParserConfigurationException | IOException | SAXException e ){
			e.printStackTrace( );
		}
	}
}
