package domain;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement( name = "student" )
@XmlType( propOrder = { "id", "firstname", "lastname", "age" } )
public class Student{
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	
	public Student( ){
	
	}
	
	public Student( int id, String firstname, String lastname, int age ){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public int getId( ){
		return id;
	}
	
	@XmlElement( name = "id" )
	public void setId( int id ){
		this.id = id;
	}
	
	public String getFirstname( ){
		return firstname;
	}
	
	@XmlElement( name = "firstname" )
	public void setFirstname( String firstname ){
		this.firstname = firstname;
	}
	
	public String getLastname( ){
		return lastname;
	}
	
	@XmlElement( name = "lastname" )
	public void setLastname( String lastname ){
		this.lastname = lastname;
	}
	
	public int getAge( ){
		return age;
	}
	
	@XmlElement( name = "age" )
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
