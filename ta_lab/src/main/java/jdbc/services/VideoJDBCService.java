package jdbc.services;

import entities.Video;
import jdbc.dao.ImpVideo;
import jdbc.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class VideoJDBCService implements IDAO< Video>{
	private final ImpVideo impVideo = new ImpVideo();
	
	
	@Override
	public Optional< Video > get( int id ){
		return impVideo.get( id );
	}
	
	@Override
	public List< Video > getAll( ){
		return impVideo.getAll();
	}
	
	@Override
	public void save( Video video ){
		impVideo.save( video );
	}
	
	@Override
	public void update( Video video ){
		impVideo.update( video );
	}
	
	@Override
	public void delete( Video video ){
		impVideo.delete( video );
	}
}
