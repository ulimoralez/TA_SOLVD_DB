package domain;

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
	
	public void setId( int id ){
		this.id = id;
	}
	
	public int getVideoId( ){
		return videoId;
	}
	
	public void setVideoId( int videoId ){
		this.videoId = videoId;
	}
	
	public String getName( ){
		return name;
	}
	
	public void setName( String name ){
		this.name = name;
	}
	
	public int getMaximumStorageGB( ){
		return maximumStorageGB;
	}
	
	public void setMaximumStorageGB( int maximumStorageGB ){
		this.maximumStorageGB = maximumStorageGB;
	}
	
	public String getPlans( ){
		return plans;
	}
	
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
