package domain;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement( name = "course" )
@XmlType( propOrder = { "id", "videoId", "learninPathId", "name", "description", "durationHS" } )
public class Course{
	private int id;
	private int videoId;
	private int learninPathId;
	private String name;
	private String description;
	private int durationHS;
	
	public Course( int id, int videoId, int learninPathId, String name, String description, int durationHS ){
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
	
	public int getId( ){
		return id;
	}
	
	@XmlElement(name = "id")
	public void setId( int id ){
		this.id = id;
	}
	
	public int getVideoId( ){
		return videoId;
	}
	
	@XmlElement(name = "videoId")
	public void setVideoId( int videoId ){
		this.videoId = videoId;
	}
	
	public int getLearninPathId( ){
		return learninPathId;
	}
	
	@XmlElement(name = "learninPathId")
	public void setLearninPathId( int learninPathId ){
		this.learninPathId = learninPathId;
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
	
	public int getDurationHS( ){
		return durationHS;
	}
	
	@XmlElement(name = "durationHS")
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
