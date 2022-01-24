package xml.service;

import entities.LearningPath;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class LearingPathXMLService implements IDAO< LearningPath >{
	@Override
	public Optional< LearningPath > get( int id ){
		return Optional.empty( );
	}
	
	@Override
	public List< LearningPath > getAll( ){
		return null;
	}
	
	@Override
	public void save( LearningPath learningPath ){
	
	}
	
	@Override
	public void update( LearningPath learningPath ){
	
	}
	
	@Override
	public void delete( LearningPath learningPath ){
	
	}
}
