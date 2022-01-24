package json.service;

import entities.College;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class CollegeJSONService implements IDAO< College >{
	@Override
	public Optional< College > get( int id ){
		return Optional.empty( );
	}
	
	@Override
	public List< College > getAll( ){
		return null;
	}
	
	@Override
	public void save( College college ){
	
	}
	
	@Override
	public void update( College college ){
	
	}
	
	@Override
	public void delete( College college ){
	
	}
}
