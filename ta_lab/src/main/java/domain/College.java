package domain;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.sql.Timestamp;

@XmlRootElement( name = "college" )
@XmlType( propOrder = { "id", "name", "foundationAge" } )
public class College{
	private int id;
	private String name;
	private Timestamp foundationAge;
	
	public College( ){
	}
	
	public College( String name, Timestamp foundationAge, int id ){
		this( name, foundationAge );
		this.id = id;
	}
	
	public College( String name, Timestamp foundationAge ){
		this.name = name;
		this.foundationAge = foundationAge;
	}
	
	public int getId( ){
		return id;
	}
	
	public void setId( int id ){
		this.id = id;
	}
	
	public String getName( ){
		return name;
	}
	
	public void setName( String name ){
		this.name = name;
	}
	
	public Timestamp getFoundationAge( ){
		return foundationAge;
	}
	
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
