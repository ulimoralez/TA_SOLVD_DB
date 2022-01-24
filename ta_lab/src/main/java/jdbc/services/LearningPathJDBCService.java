package jdbc.services;

import entities.LearningPath;
import jdbc.dao.ImpLearningPath;
import services.interfaces.IDAO;

import java.util.List;
import java.util.Optional;

public class LearningPathJDBCService implements IDAO< LearningPath >{
	private final ImpLearningPath impLearningPath = new ImpLearningPath( );
	
	@Override
	public Optional< LearningPath > get( int id ){
		return impLearningPath.get( id );
	}
	
	@Override
	public List< LearningPath > getAll( ){
		return impLearningPath.getAll( );
	}
	
	@Override
	public void save( LearningPath learningPath ){
		impLearningPath.save( learningPath );
	}
	
	@Override
	public void update( LearningPath learningPath ){
		impLearningPath.update( learningPath );
	}
	
	@Override
	public void delete( LearningPath learningPath ){
		impLearningPath.delete( learningPath );
	}
}
