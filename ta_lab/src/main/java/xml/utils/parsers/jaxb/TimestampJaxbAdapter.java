package xml.utils.parsers.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampJaxbAdapter extends XmlAdapter< String, Timestamp >{
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy-MM-dd-HH.mm.ss.SSSSSS" );
	
	@Override
	public Timestamp unmarshal( String value ){
		return Timestamp.valueOf( LocalDateTime.parse( value, formatter ) );
	}
	
	@Override
	public String marshal( Timestamp timestamp ){
		return timestamp.toLocalDateTime( ).format( formatter );
	}
}
