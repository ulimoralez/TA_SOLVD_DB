package domain;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement( name = "video" )
@XmlType( propOrder = { "id", "hostingId", "name", "description", "durationMinutes" } )
public class Video{
	private int id;
	private int hostingId;
	private String name;
	private String description;
	private int durationMinutes;
	
	public Video( ){
	
	}
	
	public Video( int id, int hostingId, String name, String description, int durationMinutes ){
		this.id = id;
		this.hostingId = hostingId;
		this.name = name;
		this.description = description;
		this.durationMinutes = durationMinutes;
	}
	
	public int getId( ){
		return id;
	}
	
	@XmlElement( name = "id" )
	public void setId( int id ){
		this.id = id;
	}
	
	public int getHostingId( ){
		return hostingId;
	}
	
	@XmlElement( name = "hostingId" )
	public void setHostingId( int hostingId ){
		this.hostingId = hostingId;
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
	
	public int getDurationMinutes( ){
		return durationMinutes;
	}
	
	@XmlElement( name = "durationMinutes" )
	public void setDurationMinutes( int durationMinutes ){
		this.durationMinutes = durationMinutes;
	}
	
	@Override
	public String toString( ){
		return "Video{" +
				"id=" + id +
				", hostingId=" + hostingId +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", durationMinutes=" + durationMinutes +
				'}';
	}
}
