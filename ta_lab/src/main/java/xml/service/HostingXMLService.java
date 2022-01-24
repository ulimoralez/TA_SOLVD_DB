package xml.service;

import entities.Hosting;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class HostingXMLService implements IDAO< Hosting >{
	@Override
	public Optional< Hosting > get( int id ){
		return Optional.empty( );
	}
	
	@Override
	public List< Hosting > getAll( ){
		return null;
	}
	
	@Override
	public void save( Hosting hosting ){
	
	}
	
	@Override
	public void update( Hosting hosting ){
	
	}
	
	@Override
	public void delete( Hosting hosting ){
	
	}
}
