package runners;

import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Category;
import json.utils.JSONUtils;

import java.io.IOException;
import java.util.logging.Logger;

public class JSONRunner{
	public static void main( String[] args ) throws IOException{
		Logger LOGGER = Logger.getLogger( JSONRunner.class.getName( ) );
		
		JSONUtils< Category > categoryJSONUtils = new JSONUtils<>( );
		Category category = new Category( 1, "Programming", "Courses about programming" );
		Category categoryFromJson = new Category( );
		String jsonPath = "src/main/resources/json/emptyjson.json";
		
		String result = new ObjectMapper( ).writeValueAsString( category );
		LOGGER.info( "" + result );
		
		categoryJSONUtils.ObjectToJSON( category, jsonPath );
		LOGGER.info( "Converted object into JSON" );
		categoryFromJson = categoryJSONUtils.JSONToObject( categoryFromJson, jsonPath );
		LOGGER.info( "Converted JSON into Object " + categoryFromJson );
		
		
	}
}
