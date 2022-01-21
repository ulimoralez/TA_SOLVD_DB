package jdbc.services;

import entities.Hosting;
import jdbc.dao.ImpHosting;
import jdbc.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class HostingJDBCService implements IDAO< Hosting >{
	private final ImpHosting impHosting = new ImpHosting();
	
	@Override
	public Optional< Hosting > get( int id ){
		return impHosting.get( id );
	}
	
	@Override
	public List< Hosting > getAll( ){
		return impHosting.getAll();
	}
	
	@Override
	public void save( Hosting hosting ){
		impHosting.save( hosting );
	}
	
	@Override
	public void update( Hosting hosting ){
		impHosting.update( hosting );
	}
	
	@Override
	public void delete( Hosting hosting ){
		impHosting.delete( hosting );
	}
}
