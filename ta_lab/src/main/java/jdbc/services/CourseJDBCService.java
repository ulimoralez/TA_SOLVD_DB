package jdbc.services;

import entities.Course;
import jdbc.dao.ImpCourse;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class CourseJDBCService implements IDAO< Course >{
	private final ImpCourse impCourse = new ImpCourse( );
	
	@Override
	public Optional< Course > get( int id ){
		return impCourse.get( id );
	}
	
	@Override
	public List< Course > getAll( ){
		return impCourse.getAll( );
	}
	
	@Override
	public void save( Course course ){
		impCourse.save( course );
	}
	
	@Override
	public void update( Course course ){
		impCourse.update( course );
	}
	
	@Override
	public void delete( Course course ){
		impCourse.delete( course );
	}
}
