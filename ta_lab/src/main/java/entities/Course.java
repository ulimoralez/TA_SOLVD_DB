package entities;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement( name = "course" )
@XmlType( propOrder = { "id", "videoId", "learninPathId", "name", "description", "durationHS" } )
@JsonRootName(value = "course")
@JsonPropertyOrder({ "id", "videoId", "learninPathId", "name", "description", "durationHS" })
public class Course{
	private int id;
	private int videoId;
	private int learninPathId;
	private String name;
	private String description;
	private int durationHS;
	
	@JsonCreator
	public Course(
			@JsonProperty("id") int id,
			@JsonProperty("videoId") int videoId,
			@JsonProperty("learninPathId") int learninPathId,
			@JsonProperty("name") String name,
			@JsonProperty("description") String description,
			@JsonProperty("durationHS") int durationHS ){
		this( videoId, learninPathId, name, description, durationHS );
		this.id = id;
	}
	
	public Course( int videoId, int learninPathId, String name, String description, int durationHS ){
		this.videoId = videoId;
		this.learninPathId = learninPathId;
		this.name = name;
		this.description = description;
		this.durationHS = durationHS;
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
	
	@JsonGetter("videoId")
	public int getVideoId( ){
		return videoId;
	}
	
	@XmlElement( name = "videoId" )
	@JsonSetter("videoId")
	public void setVideoId( int videoId ){
		this.videoId = videoId;
	}
	
	@JsonGetter("learninPathId")
	public int getLearninPathId( ){
		return learninPathId;
	}
	
	@XmlElement( name = "learninPathId" )
	@JsonSetter("learninPathId")
	public void setLearninPathId( int learninPathId ){
		this.learninPathId = learninPathId;
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
	
	@JsonGetter("durationHS")
	public int getDurationHS( ){
		return durationHS;
	}
	
	@XmlElement( name = "durationHS" )
	@JsonSetter("durationHS")
	public void setDurationHS( int durationHS ){
		this.durationHS = durationHS;
	}
	
	
	@Override
	public String toString( ){
		return "Course{" +
				"id=" + id +
				", videoId=" + videoId +
				", learninPathId=" + learninPathId +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", durationHS=" + durationHS +
				'}';
	}
}
