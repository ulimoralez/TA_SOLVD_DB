package domain;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement( name = "professor" )
@XmlType( propOrder = { "id", "specializationId", "firstname", "lastname", "age" } )
@JsonRootName(value = "professor")
@JsonPropertyOrder({ "id", "specializationId", "firstname", "lastname", "age" })
public class Professor{
	private int id;
	private int specializationId;
	private String firstname;
	private String lastname;
	private int age;
	
	public Professor( ){
	
	}
	
	@JsonCreator
	public Professor(
			@JsonProperty("id")int id,
			@JsonProperty("specializationId")int specializationId,
			@JsonProperty("firstname")String firstname,
			@JsonProperty("lastname")String lastname,
			@JsonProperty("age")int age ){
		this.id = id;
		this.specializationId = specializationId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	@JsonGetter("id")
	public int getId( ){
		return id;
	}
	
	@XmlElement( name = "id" )
	@JsonSetter("id")
	public void setId( int id ){
		this.id = id;
	}
	
	@JsonGetter("specializationId")
	public int getSpecializationId( ){
		return specializationId;
	}
	
	@XmlElement( name = "specializationId" )
	@JsonSetter("specializationId")
	public void setSpecializationId( int specializationId ){
		this.specializationId = specializationId;
	}
	
	@JsonGetter("firstname")
	public String getFirstname( ){
		return firstname;
	}
	
	@XmlElement( name = "firstname" )
	@JsonSetter("firstname")
	public void setFirstname( String firstname ){
		this.firstname = firstname;
	}
	
	@JsonGetter("lastname")
	public String getLastname( ){
		return lastname;
	}
	
	@XmlElement( name = "lastname" )
	@JsonSetter("lastname")
	public void setLastname( String lastname ){
		this.lastname = lastname;
	}
	
	@JsonGetter("age")
	public int getAge( ){
		return age;
	}
	
	@XmlElement( name = "age" )
	@JsonSetter("age")
	public void setAge( int age ){
		this.age = age;
	}
	
	@Override
	public String toString( ){
		return "Professor{" +
				"id=" + id +
				", specializationId=" + specializationId +
				", firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", age=" + age +
				'}';
	}
}
