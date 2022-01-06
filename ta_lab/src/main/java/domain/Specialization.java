package domain;

import java.sql.Timestamp;

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
	
	public void setId( int id ){
		this.id = id;
	}
	
	public String getName( ){
		return name;
	}
	
	public void setName( String name ){
		this.name = name;
	}
	
	public String getDescription( ){
		return description;
	}
	
	public void setDescription( String description ){
		this.description = description;
	}
	
	public Timestamp getFoundationAge( ){
		return foundationAge;
	}
	
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
