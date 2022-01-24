package mybatis.service;

import entities.Video;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class VideoMyBatisService implements IDAO< Video >{
	@Override
	public Optional< Video > get( int id ){
		return Optional.empty( );
	}
	
	@Override
	public List< Video > getAll( ){
		return null;
	}
	
	@Override
	public void save( Video video ){
	
	}
	
	@Override
	public void update( Video video ){
	
	}
	
	@Override
	public void delete( Video video ){
	
	}
}
