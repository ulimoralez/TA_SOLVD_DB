package mybatis.service;

import entities.Specialization;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class SpecializationMyBatisService implements IDAO< Specialization >{
	@Override
	public Optional< Specialization > get( int id ){
		return Optional.empty( );
	}
	
	@Override
	public List< Specialization > getAll( ){
		return null;
	}
	
	@Override
	public void save( Specialization specialization ){
	
	}
	
	@Override
	public void update( Specialization specialization ){
	
	}
	
	@Override
	public void delete( Specialization specialization ){
	
	}
}
