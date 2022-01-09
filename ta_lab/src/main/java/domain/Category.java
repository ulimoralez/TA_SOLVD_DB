package domain;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement( name = "category" )
@XmlType( propOrder = { "id", "name", "description" } )
@JsonRootName(value = "category")
@JsonPropertyOrder({"id", "name","description" })
public class Category{
	private int id;
	private String name;
	private String description;
	
	public Category( ){
	
	}
	
	@JsonCreator
	public Category
			(
			@JsonProperty("id") int id,
			@JsonProperty("name") String name,
			@JsonProperty("description") String description
			){
		this( name, description );
		this.id = id;
		
	}
	
	public Category( String name, String description ){
		this.name = name;
		this.description = description;
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
	
	@Override
	public String toString( ){
		return "Category{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
