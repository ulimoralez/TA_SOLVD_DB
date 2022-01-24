package mybatis.service;

import entities.Category;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class CategoryMyBatisService implements IDAO< Category >{
	@Override
	public Optional< Category > get( int id ){
		return Optional.empty( );
	}
	
	@Override
	public List< Category > getAll( ){
		return null;
	}
	
	@Override
	public void save( Category category ){
	
	}
	
	@Override
	public void update( Category category ){
	
	}
	
	@Override
	public void delete( Category category ){
	
	}
}
