package entities;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import xml.service.jaxb.TimestampJaxbAdapter;

import java.sql.Timestamp;

@XmlRootElement( name = "learningpath" )
@XmlType( propOrder = { "id", "name", "description", "creationDate" } )
@JsonRootName(value = "learningpath")
@JsonPropertyOrder({ "id", "name", "description", "creationDate" })
public class LearningPath{
	private int id;
	private String name;
	private String description;
	private Timestamp creationDate;
	
	public LearningPath( ){
	
	}
	
	@JsonCreator
	public LearningPath(
			@JsonProperty("id")int id,
			@JsonProperty("name")String name,
			@JsonProperty("description")String description,
			@JsonProperty("creationDate")Timestamp creationDate ){
		this.id = id;
		this.name = name;
		this.description = description;
		this.creationDate = creationDate;
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
	
	@JsonGetter("description")
	public String getDescription( ){
		return description;
	}
	
	@XmlElement( name = "description" )
	@JsonSetter("description")
	public void setDescription( String description ){
		this.description = description;
	}
	
	@JsonGetter("creationDate")
	public Timestamp getCreationDate( ){
		return creationDate;
	}
	
	@XmlElement( name = "creationDate" )
	@XmlJavaTypeAdapter( TimestampJaxbAdapter.class )
	@JsonSetter("creationDate")
	public void setCreationDate( Timestamp creationDate ){
		this.creationDate = creationDate;
	}
	
	@Override
	public String toString( ){
		return "LearningPath{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", creationDate=" + creationDate +
				'}';
	}
}
