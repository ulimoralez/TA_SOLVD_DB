package jdbc.services;

import entities.Student;
import jdbc.dao.ImpStudent;
import jdbc.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class StudentJDBCService implements IDAO< Student>{
	private final ImpStudent impStudent = new ImpStudent();
	
	@Override
	public Optional< Student > get( int id ){
		return impStudent.get( id );
	}
	
	@Override
	public List< Student > getAll( ){
		return impStudent.getAll();
	}
	
	@Override
	public void save( Student student ){
		impStudent.save( student );
	}
	
	@Override
	public void update( Student student ){
		impStudent.update( student );
	}
	
	@Override
	public void delete( Student student ){
		impStudent.delete( student );
	}
}
