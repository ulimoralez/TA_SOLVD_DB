package domain;

import java.sql.Timestamp;

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
	
	public Timestamp getCreationDate( ){
		return creationDate;
	}
	
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
