package domain;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import utils.xml.jaxb.TimestampJaxbAdapter;

import java.sql.Timestamp;

@XmlRootElement( name = "specialization" )
@XmlType( propOrder = { "id", "name", "description", "foundationAge" } )
@JsonRootName(value = "specialization")
@JsonPropertyOrder({ "id", "name", "description", "foundationAge" })
public class Specialization{
	private int id;
	private String name;
	private String description;
	private Timestamp foundationAge;
	
	public Specialization( ){
	
	}
	
	@JsonCreator
	public Specialization(
			@JsonProperty("id")int id,
			@JsonProperty("name")String name,
			@JsonProperty("description")String description,
			@JsonProperty("foundationAge")Timestamp foundationAge ){
		this.id = id;
		this.name = name;
		this.description = description;
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
	
	@JsonGetter("description")
	public String getDescription( ){
		return description;
	}
	
	@XmlElement( name = "description" )
	@JsonSetter("description")
	public void setDescription( String description ){
		this.description = description;
	}
	
	@JsonGetter("foundationAge")
	public Timestamp getFoundationAge( ){
		return foundationAge;
	}
	
	@XmlElement( name = "foundationAge" )
	@XmlJavaTypeAdapter( TimestampJaxbAdapter.class )
	@JsonSetter("foundationAge")
	public void setFoundationAge( Timestamp foundationAge ){
		this.foundationAge = foundationAge;
	}
	
	@Override
	public String toString( ){
		return "Specialization{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", foundationAge=" + foundationAge +
				'}';
	}
}
