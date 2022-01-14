package entities;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement( name = "video" )
@XmlType( propOrder = { "id", "hostingId", "name", "description", "durationMinutes" } )
@JsonRootName(value = "video")
@JsonPropertyOrder({ "id", "hostingId", "name", "description", "durationMinutes" } )
public class Video{
	private int id;
	private int hostingId;
	private String name;
	private String description;
	private int durationMinutes;
	
	public Video( ){
	
	}
	
	@JsonCreator
	public Video(
			@JsonProperty("id")int id,
			@JsonProperty("hostingId")int hostingId,
			@JsonProperty("name")String name,
			@JsonProperty("description")String description,
			@JsonProperty("durationMinutes")int durationMinutes ){
		this.id = id;
		this.hostingId = hostingId;
		this.name = name;
		this.description = description;
		this.durationMinutes = durationMinutes;
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
	
	@JsonGetter("hostingId")
	public int getHostingId( ){
		return hostingId;
	}
	
	@XmlElement( name = "hostingId" )
	@JsonSetter("hostingId")
	public void setHostingId( int hostingId ){
		this.hostingId = hostingId;
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
	
	@JsonGetter("durationMinutes")
	public int getDurationMinutes( ){
		return durationMinutes;
	}
	
	@XmlElement( name = "durationMinutes" )
	@JsonSetter("durationMinutes")
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
