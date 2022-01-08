package domain;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import utils.xml.jaxb.TimestampJaxbAdapter;

import java.sql.Timestamp;

@XmlRootElement( name = "learningpath" )
@XmlType( propOrder = { "id", "name", "description", "creationDate" } )
public class LearningPath{
	private int id;
	private String name;
	private String description;
	private Timestamp creationDate;
	
	public LearningPath( ){
	
	}
	
	public LearningPath( int id, String name, String description, Timestamp creationDate ){
		this.id = id;
		this.name = name;
		this.description = description;
		this.creationDate = creationDate;
	}
	
	public int getId( ){
		return id;
	}
	
	@XmlElement( name = "id" )
	public void setId( int id ){
		this.id = id;
	}
	
	public String getName( ){
		return name;
	}
	
	@XmlElement( name = "name" )
	public void setName( String name ){
		this.name = name;
	}
	
	public String getDescription( ){
		return description;
	}
	
	@XmlElement( name = "description" )
	public void setDescription( String description ){
		this.description = description;
	}
	
	public Timestamp getCreationDate( ){
		return creationDate;
	}
	
	@XmlElement( name = "creationDate" )
	@XmlJavaTypeAdapter( TimestampJaxbAdapter.class )
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
