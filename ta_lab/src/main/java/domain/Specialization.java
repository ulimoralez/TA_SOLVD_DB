package domain;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import utils.xml.jaxb.TimestampJaxbAdapter;

import java.sql.Timestamp;

@XmlRootElement( name = "specialization" )
@XmlType( propOrder = { "id", "name", "description", "foundationAge" } )
public class Specialization{
	private int id;
	private String name;
	private String description;
	private Timestamp foundationAge;
	
	public Specialization( ){
	
	}
	
	public Specialization( int id, String name, String description, Timestamp foundationAge ){
		this.id = id;
		this.name = name;
		this.description = description;
		this.foundationAge = foundationAge;
	}
	
	public int getId( ){
		return id;
	}
	
	@XmlElement(name = "id")
	public void setId( int id ){
		this.id = id;
	}
	
	public String getName( ){
		return name;
	}
	
	@XmlElement(name = "name")
	public void setName( String name ){
		this.name = name;
	}
	
	public String getDescription( ){
		return description;
	}
	
	@XmlElement(name = "description")
	public void setDescription( String description ){
		this.description = description;
	}
	
	public Timestamp getFoundationAge( ){
		return foundationAge;
	}
	
	@XmlElement(name = "foundationAge")
	@XmlJavaTypeAdapter( TimestampJaxbAdapter.class )
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
