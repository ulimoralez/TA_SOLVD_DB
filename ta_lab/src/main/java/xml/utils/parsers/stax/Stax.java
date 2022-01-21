package xml.utils.parsers.stax;

import entities.Category;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.stax.StAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Stax{
	private final Logger LOGGER = Logger.getLogger( Stax.class.getName( ) );
	SchemaFactory validatorFactory;
	Schema validatorSchema;
	Validator validator;
	private String xmlPath;
	private String xsdPath;
	//Validator
	private XMLStreamReader validatorReader;
	//Parser
	private XMLInputFactory xmlInputFactory;
	private XMLEventReader xmlReader;
	
	public Stax( String xmlPath, String xsdPath ) throws XMLStreamException, FileNotFoundException, SAXException{
		this.xmlPath = xmlPath;
		this.xsdPath = xsdPath;
	}
	
	public String getXmlPath( ){
		return xmlPath;
	}
	
	public void setXmlPath( String xmlPath ){
		this.xmlPath = xmlPath;
	}
	
	public String getXsdPath( ){
		return xsdPath;
	}
	
	public void setXsdPath( String xsdPath ){
		this.xsdPath = xsdPath;
	}
	
	public void validateXML( ) throws IOException, SAXException, XMLStreamException{
		validatorReader = XMLInputFactory.newInstance( ).createXMLStreamReader( new FileInputStream( this.xmlPath ) );
		validatorFactory = SchemaFactory.newInstance( XMLConstants.W3C_XML_SCHEMA_NS_URI );
		validatorSchema = validatorFactory.newSchema( new File( this.xsdPath ) );
		validator = validatorSchema.newValidator( );
		validator.validate( new StAXSource( validatorReader ) );
		LOGGER.info( "Executed validation!" );
	}
	
	//Need to fix this method, how to implement it and accept all the types, maybe it's possible
	public ArrayList< Category > parseXMLCategory( ) throws FileNotFoundException, XMLStreamException{
		xmlInputFactory = XMLInputFactory.newInstance( );
		xmlReader = xmlInputFactory.createXMLEventReader( new FileInputStream( this.xmlPath ) );
		ArrayList< Category > categories = new ArrayList<>( );
		Category category = null;
		while( xmlReader.hasNext( ) ){
			XMLEvent nextEvent = xmlReader.nextEvent( );
			if( nextEvent.isStartElement( ) ){
				StartElement startElement = nextEvent.asStartElement( );
				switch( startElement.getName( ).getLocalPart( ) ){
					case "categoryId":
						category = new Category( );
						nextEvent = xmlReader.nextEvent( );
						category.setId( Integer.parseInt( nextEvent.asCharacters( ).getData( ) ) );
						break;
					case "name":
						nextEvent = xmlReader.nextEvent( );
						if( category != null ){
							category.setName( nextEvent.asCharacters( ).getData( ) );
						}
						break;
					case "description":
						nextEvent = xmlReader.nextEvent( );
						if( category != null ){
							category.setDescription( nextEvent.asCharacters( ).getData( ) );
						}
						break;
				}
			}
			if( nextEvent.isEndElement( ) ){
				EndElement endElement = nextEvent.asEndElement( );
				if( endElement.getName( ).getLocalPart( ).equals( "category" ) ){
					categories.add( category );
				}
			}
		}
		return categories;
	}
}
