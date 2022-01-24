package xml.service;

import entities.Professor;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class ProfessorXMLService implements IDAO< Professor >{
	@Override
	public Optional< Professor > get( int id ){
		return Optional.empty( );
	}
	
	@Override
	public List< Professor > getAll( ){
		return null;
	}
	
	@Override
	public void save( Professor professor ){
	
	}
	
	@Override
	public void update( Professor professor ){
	
	}
	
	@Override
	public void delete( Professor professor ){
	
	}
}
