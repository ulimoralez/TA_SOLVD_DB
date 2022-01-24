package json.service;

import entities.Student;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class StudentJSONService implements IDAO< Student >{
	@Override
	public Optional< Student > get( int id ){
		return Optional.empty( );
	}
	
	@Override
	public List< Student > getAll( ){
		return null;
	}
	
	@Override
	public void save( Student student ){
	
	}
	
	@Override
	public void update( Student student ){
	
	}
	
	@Override
	public void delete( Student student ){
	
	}
}
