package json.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class JSONUtils< T >{
	ObjectMapper objectMapper = new ObjectMapper( );
	private Logger LOGGER = Logger.getLogger( JSONUtils.class.getName( ) );
	
	public void ObjectToJSON( T t, String jsonPath ) throws IOException{
		objectMapper.writeValue( new File( jsonPath ), t );
	}
	
	public T JSONToObject( T t, String jsonPath ) throws IOException{
		T result = ( T ) objectMapper.readValue( new File( jsonPath ), t.getClass( ) );
		return result;
	}
	
	public ArrayList< T > JSONToObjectList( T t, String jsonPath ) throws IOException{
		ArrayList< T > result = objectMapper.readValue( new File( jsonPath ), new TypeReference< ArrayList< T > >( ){
		} );
		return result;
	}
}
