package entities;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement( name = "course" )
@XmlType( propOrder = { "id", "videoId", "learningPathId", "name", "description", "durationHS", "creation_date" } )
@JsonRootName( value = "course" )
@JsonPropertyOrder( { "id", "videoId", "learningPathId", "name", "description", "durationHS", "creation_date" } )
public class Course{
	private int id;
	private int videoId;
	private int learningPathId;
	private String name;
	private String description;
	private float durationHS;
	private Timestamp creation_date;
	
	private List< Professor > professors = new ArrayList<>( );
	private List< Student > students = new ArrayList<>( );
	
	
	@JsonCreator
	public Course(
			@JsonProperty( "id" ) int id,
			@JsonProperty( "videoId" ) int videoId,
			@JsonProperty( "learningPathId" ) int learninPathId,
			@JsonProperty( "name" ) String name,
			@JsonProperty( "description" ) String description,
			@JsonProperty( "durationHS" ) float durationHS ){
		this( videoId, learninPathId, name, description, durationHS );
		this.id = id;
	}
	
	public Course( int videoId, int learninPathId, String name, String description, float durationHS ){
		this.videoId = videoId;
		this.learningPathId = learninPathId;
		this.name = name;
		this.description = description;
		this.durationHS = durationHS;
	}
	
	public Course( int videoId, int learninPathId, String name, String description, float durationHS,
	               Timestamp creation_date ){
		this.videoId = videoId;
		this.learningPathId = learninPathId;
		this.name = name;
		this.description = description;
		this.durationHS = durationHS;
		this.creation_date = creation_date;
	}
	
	@JsonGetter( "id" )
	public int getId( ){
		return id;
	}
	
	@XmlElement( name = "id" )
	@JsonSetter( "id" )
	public void setId( int id ){
		this.id = id;
	}
	
	@JsonGetter( "videoId" )
	public int getVideoId( ){
		return videoId;
	}
	
	@XmlElement( name = "videoId" )
	@JsonSetter( "videoId" )
	public void setVideoId( int videoId ){
		this.videoId = videoId;
	}
	
	@JsonGetter( "learningPathId" )
	public int getLearningPathId( ){
		return learningPathId;
	}
	
	@XmlElement( name = "learningPathId" )
	@JsonSetter( "learningPathId" )
	public void setLearningPathId( int learningPathId ){
		this.learningPathId = learningPathId;
	}
	
	@JsonGetter( "name" )
	public String getName( ){
		return name;
	}
	
	@XmlElement( name = "name" )
	@JsonSetter( "name" )
	public void setName( String name ){
		this.name = name;
	}
	
	@JsonGetter( "description" )
	public String getDescription( ){
		return description;
	}
	
	@XmlElement( name = "description" )
	@JsonSetter( "description" )
	public void setDescription( String description ){
		this.description = description;
	}
	
	@JsonGetter( "durationHS" )
	public float getDurationHS( ){
		return durationHS;
	}
	
	@XmlElement( name = "durationHS" )
	@JsonSetter( "durationHS" )
	public void setDurationHS( float durationHS ){
		this.durationHS = durationHS;
	}
	
	
	@Override
	public String toString( ){
		return "Course{" +
				"id=" + id +
				", videoId=" + videoId +
				", learningPathId=" + learningPathId +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", durationHS=" + durationHS +
				'}';
	}
}
