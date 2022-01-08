package domain;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement( name = "category" )
@XmlType( propOrder = { "id", "name", "description" } )
public class Category{
	private int id;
	private String name;
	private String description;
	
	public Category( ){
	
	}
	
	public Category( int id, String name, String description ){
		this( name, description );
		this.id = id;
		
	}
	
	public Category( String name, String description ){
		this.name = name;
		this.description = description;
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
	
	@Override
	public String toString( ){
		return "Category{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
