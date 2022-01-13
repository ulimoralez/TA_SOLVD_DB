package domain;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.sql.Timestamp;

@XmlRootElement( name = "college" )
@XmlType( propOrder = { "id", "name", "foundationAge" } )
@JsonRootName(value = "college")
@JsonPropertyOrder({"id", "name","foundationAge" })
public class College{
	private int id;
	private String name;
	private Timestamp foundationAge;
	
	public College( ){
	}
	
	@JsonCreator
	public College(
			@JsonProperty("name") String name,
			@JsonProperty("foundationAge") Timestamp foundationAge,
			@JsonProperty("id") int id ){
		this( name, foundationAge );
		this.id = id;
	}
	
	public College( String name, Timestamp foundationAge ){
		this.name = name;
		this.foundationAge = foundationAge;
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
	
	@JsonGetter("name")
	public String getName( ){
		return name;
	}
	
	@XmlElement( name = "name" )
	@JsonSetter("name")
	public void setName( String name ){
		this.name = name;
	}
	
	@JsonGetter("foundationAge")
	public Timestamp getFoundationAge( ){
		return foundationAge;
	}
	
	@XmlElement( name = "foundationAge" )
	@JsonSetter("foundationAge")
	public void setFoundationAge( Timestamp foundationAge ){
		this.foundationAge = foundationAge;
	}
	
	@Override
	public String toString( ){
		return "College{" +
				"id=" + id +
				", name='" + name + '\'' +
				", foundationAge=" + foundationAge +
				'}';
	}
}
