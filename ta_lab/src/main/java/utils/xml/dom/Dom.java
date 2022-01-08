package utils.xml.dom;

import domain.College;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Dom{
	private Logger LOGGER = Logger.getLogger( Dom.class.getName( ) );
	private DocumentBuilder builder;
	
	private Document doc;
	
	public Dom( ){
	}
	
	public void parseCollegeXML( ) throws ParserConfigurationException, IOException, SAXException{
		ArrayList< College > colleges = new ArrayList<>( );
		
		builder = DocumentBuilderFactory.newInstance( ).newDocumentBuilder( );
		doc = builder.parse( new File( "src/main/resources/xml/College/college.xml" ) );
		
		Node first = doc.getElementsByTagName( "college" ).item( 0 );
		NodeList nodeList = first.getChildNodes( );
		int n = nodeList.getLength( );
		Node current;
		
		for( int i = 0; i < n; i++ ){
			current = nodeList.item( i );
			if( current.getNodeType( ) == Node.ELEMENT_NODE ){
				LOGGER.info( "" + current.getNodeName( ) + ": " + current.getTextContent( ) );
			}
		}
	}
}
