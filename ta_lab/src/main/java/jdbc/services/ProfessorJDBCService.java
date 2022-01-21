package jdbc.services;

import entities.Professor;
import jdbc.dao.ImpProfessor;
import jdbc.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class ProfessorJDBCService implements IDAO< Professor>{
	private final ImpProfessor impProfessor = new ImpProfessor();
	
	@Override
	public Optional< Professor > get( int id ){
		return impProfessor.get( id );
	}
	
	@Override
	public List< Professor > getAll( ){
		return impProfessor.getAll();
	}
	
	@Override
	public void save( Professor professor ){
		impProfessor.save( professor );
	}
	
	@Override
	public void update( Professor professor ){
		impProfessor.update( professor );
	}
	
	@Override
	public void delete( Professor professor ){
		impProfessor.delete( professor );
	}
}
