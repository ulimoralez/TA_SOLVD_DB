package jdbc.services;

import entities.Category;
import entities.Course;
import jdbc.dao.ImpCategory;
import services.interfaces.IDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CategoryJDBCService implements IDAO< Category >{
	private final ImpCategory impCategory = new ImpCategory( );
	
	
	@Override
	public Optional< Category > get( int id ){
		return impCategory.get( id );
	}
	
	@Override
	public List< Category > getAll( ){
		return impCategory.getAll( );
	}
	
	@Override
	public void save( Category category ){
		impCategory.save( category );
	}
	
	@Override
	public void update( Category category ){
		impCategory.update( category );
	}
	
	@Override
	public void delete( Category category ){
		impCategory.delete( category );
	}
	
	public List< Course > getCoursesByCategory( Category category ){
		List< Course > courses = new ArrayList<>( );
		
		return courses;
	}
}
