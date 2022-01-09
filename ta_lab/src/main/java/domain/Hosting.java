package domain;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement( name = "hosting" )
@XmlType( propOrder = { "id", "videoId", "name", "maximumStorageGB", "plans" } )
@JsonRootName(value = "hosting")
@JsonPropertyOrder({ "id", "videoId", "name", "maximumStorageGB", "plans" })
public class Hosting{
	private int id;
	private int videoId;
	private String name;
	private int maximumStorageGB;
	private String plans;
	
	public Hosting( ){
	
	}
	
	@JsonCreator
	public Hosting(
			@JsonProperty("id")int id,
			@JsonProperty("videoId")int videoId,
			@JsonProperty("name")String name,
			@JsonProperty("maximumStorageGB")int maximumStorageGB,
			@JsonProperty("plans")String plans ){
		this( name, maximumStorageGB, plans );
		this.videoId = videoId;
		this.id = id;
	}
	
	public Hosting( String name, int maximumStorageGB, String plans ){
		this.name = name;
		this.maximumStorageGB = maximumStorageGB;
		this.plans = plans;
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
	
	@JsonGetter("name")
	public String getName( ){
		return name;
	}
	
	@XmlElement( name = "name" )
	@JsonSetter("name")
	public void setName( String name ){
		this.name = name;
	}
	
	@JsonGetter("maximumStorageGB")
	public int getMaximumStorageGB( ){
		return maximumStorageGB;
	}
	
	@XmlElement( name = "maximumStorageGB" )
	@JsonSetter("maximumStorageGB")
	public void setMaximumStorageGB( int maximumStorageGB ){
		this.maximumStorageGB = maximumStorageGB;
	}
	
	@JsonGetter("plans")
	public String getPlans( ){
		return plans;
	}
	
	@XmlElement( name = "plans" )
	@JsonSetter("plans")
	public void setPlans( String plans ){
		this.plans = plans;
	}
	
	@Override
	public String toString( ){
		return "Hosting{" +
				"id=" + id +
				", videoId=" + videoId +
				", name='" + name + '\'' +
				", maximumStorageGB=" + maximumStorageGB +
				", plans='" + plans + '\'' +
				'}';
	}
}
