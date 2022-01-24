package entities;

import com.fasterxml.jackson.annotation.*;
import factorypattern.IPeople;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@XmlRootElement( name = "professor" )
@XmlType( propOrder = { "id", "specializationId", "firstname", "lastname", "age" } )
@JsonRootName( value = "professor" )
@JsonPropertyOrder( { "id", "specializationId", "firstname", "lastname", "age" } )
public class Professor implements IPeople{
	private final Logger LOGGER = Logger.getLogger( Professor.class.getName( ) );
	
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	
	private List< Specialization > specializations = new ArrayList<>( );
	
	
	// -------------------------------------------------------------------------------
	// Constructors
	public Professor( ){
	
	}
	
	@JsonCreator
	public Professor(
			@JsonProperty( "id" ) int id,
			@JsonProperty( "firstname" ) String firstname,
			@JsonProperty( "lastname" ) String lastname,
			@JsonProperty( "age" ) int age ){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	@JsonCreator
	public Professor(
			@JsonProperty( "firstname" ) String firstname,
			@JsonProperty( "lastname" ) String lastname,
			@JsonProperty( "age" ) int age ){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	// -------------------------------------------------------------------------------
	
	
	@JsonGetter( "id" )
	public int getId( ){
		return id;
	}
	
	@XmlElement( name = "id" )
	@JsonSetter( "id" )
	public void setId( int id ){
		this.id = id;
	}
	
	@JsonGetter( "firstname" )
	public String getFirstname( ){
		return firstname;
	}
	
	@XmlElement( name = "firstname" )
	@JsonSetter( "firstname" )
	public void setFirstname( String firstname ){
		this.firstname = firstname;
	}
	
	@JsonGetter( "lastname" )
	public String getLastname( ){
		return lastname;
	}
	
	@XmlElement( name = "lastname" )
	@JsonSetter( "lastname" )
	public void setLastname( String lastname ){
		this.lastname = lastname;
	}
	
	@JsonGetter( "age" )
	public int getAge( ){
		return age;
	}
	
	@XmlElement( name = "age" )
	@JsonSetter( "age" )
	public void setAge( int age ){
		this.age = age;
	}
	
	@Override
	public String toString( ){
		return "Professor{" +
				"id=" + id +
				", firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", age=" + age +
				'}';
	}
	
	@Override
	public void walk( ){
		LOGGER.info( "Professor walking :D" );
	}
	
	@Override
	public boolean isProfessor( ){
		return true;
	}
	
	@Override
	public boolean isStudent( ){
		return false;
	}
}
