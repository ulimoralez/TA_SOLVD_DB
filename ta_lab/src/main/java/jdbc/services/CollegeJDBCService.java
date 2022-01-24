package jdbc.services;

import entities.College;
import jdbc.dao.ImpCollege;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class CollegeJDBCService implements IDAO< College >{
	private final ImpCollege impCollege = new ImpCollege( );
	
	@Override
	public Optional< College > get( int id ){
		return impCollege.get( id );
	}
	
	@Override
	public List< College > getAll( ){
		return impCollege.getAll( );
	}
	
	@Override
	public void save( College college ){
		impCollege.save( college );
	}
	
	@Override
	public void update( College college ){
		impCollege.update( college );
	}
	
	@Override
	public void delete( College college ){
		impCollege.delete( college );
	}
}
