package domain;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement( name = "hosting" )
@XmlType( propOrder = { "id", "videoId", "name", "maximumStorageGB", "plans" } )
public class Hosting{
	private int id;
	private int videoId;
	private String name;
	private int maximumStorageGB;
	private String plans;
	
	public Hosting( ){
	
	}
	
	public Hosting( int id, int videoId, String name, int maximumStorageGB, String plans ){
		this( name, maximumStorageGB, plans );
		this.videoId = videoId;
		this.id = id;
	}
	
	public Hosting( String name, int maximumStorageGB, String plans ){
		this.name = name;
		this.maximumStorageGB = maximumStorageGB;
		this.plans = plans;
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
	
	public String getName( ){
		return name;
	}
	
	@XmlElement(name = "name")
	public void setName( String name ){
		this.name = name;
	}
	
	public int getMaximumStorageGB( ){
		return maximumStorageGB;
	}
	
	@XmlElement(name = "maximumStorageGB")
	public void setMaximumStorageGB( int maximumStorageGB ){
		this.maximumStorageGB = maximumStorageGB;
	}
	
	public String getPlans( ){
		return plans;
	}
	
	@XmlElement(name = "plans")
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
