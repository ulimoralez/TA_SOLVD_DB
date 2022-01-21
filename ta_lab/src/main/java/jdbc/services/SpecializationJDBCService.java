package jdbc.services;

import entities.Specialization;
import jdbc.dao.ImpSpecialization;
import jdbc.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class SpecializationJDBCService implements IDAO< Specialization>{
	private final ImpSpecialization impSpecialization = new ImpSpecialization();
	
	@Override
	public Optional< Specialization > get( int id ){
		return impSpecialization.get( id );
	}
	
	@Override
	public List< Specialization > getAll( ){
		return impSpecialization.getAll();
	}
	
	@Override
	public void save( Specialization specialization ){
		impSpecialization.save( specialization );
	}
	
	@Override
	public void update( Specialization specialization ){
		impSpecialization.update( specialization );
	}
	
	@Override
	public void delete( Specialization specialization ){
		impSpecialization.delete( specialization);
	}
}
