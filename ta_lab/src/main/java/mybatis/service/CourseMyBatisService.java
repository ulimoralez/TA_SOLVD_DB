package mybatis.service;

import entities.Course;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class CourseMyBatisService implements IDAO< Course >{
	@Override
	public Optional< Course > get( int id ){
		return Optional.empty( );
	}
	
	@Override
	public List< Course > getAll( ){
		return null;
	}
	
	@Override
	public void save( Course course ){
	
	}
	
	@Override
	public void update( Course course ){
	
	}
	
	@Override
	public void delete( Course course ){
	
	}
}
