package entities;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement( name = "student" )
@XmlType( propOrder = { "id", "firstname", "lastname", "age" } )
@JsonRootName(value = "student")
@JsonPropertyOrder({ "id", "firstname", "lastname", "age" })
public class Student{
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	
	public Student( ){
	
	}
	
	@JsonCreator
	public Student(
			@JsonProperty("id")int id,
			@JsonProperty("firstname")String firstname,
			@JsonProperty("lastname")String lastname,
			@JsonProperty("age")int age ){
		this.id = id;
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
		return "Student{" +
				"id=" + id +
				", firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", age=" + age +
				'}';
	}
}
