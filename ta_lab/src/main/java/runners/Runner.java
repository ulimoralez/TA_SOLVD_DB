package runners;

import entities.*;
import jdbc.dao.*;

import java.sql.Timestamp;
import java.util.logging.Logger;

public class Runner{
	public static void main( String[] args ){
		
		final Logger LOGGER = Logger.getLogger( Runner.class.getName( ) );
		long now = System.currentTimeMillis( );
		Timestamp timestamp = new Timestamp( now );
		
		ImpCategory impCategory = new ImpCategory( );
		ImpCollege impCollege = new ImpCollege( );
		ImpCourse impCourse = new ImpCourse( );
		ImpHosting impHosting = new ImpHosting( );
		ImpLearningPath impLearningPath = new ImpLearningPath( );
		ImpProfessor impProfessor = new ImpProfessor( );
		ImpSpecialization impSpecialization = new ImpSpecialization( );
		ImpStudent impStudent = new ImpStudent( );
		ImpVideo impVideo = new ImpVideo( );
		
		Category cat = new Category( "TestCategory", "TestInsertion" );
		Category catUpdate = new Category( 5, "TestCategoryUpdated", "TestInsertion" );
		
		
		College college = new College( "EEE", timestamp );
		College collegeupdate = new College( "WWW", timestamp, 6 );
		
		Course course = new Course( 1, 1, "Java advanced", "Learn about java in depth", 5 );
		Course courseupdate = new Course( 3, 1, 1, "TestUpdatedCourse", "TestUpdatedCourse", 5 );
		
		Hosting hosting = new Hosting( 1, 1, "TestVideo", 10, "TestPlan" );
		Hosting hostingupdate = new Hosting( 5, 2, "TestVideoUpdated", 100, "TestPlanUpdated" );
		
		LearningPath learningPath = new LearningPath( 1, "Data Science", "Learn about data science", timestamp );
		LearningPath learningPathupdate = new LearningPath( 1, "Test Update", "Test Update desc", timestamp );
		
		Professor professor = new Professor( 1, 1, "Testname", "TestLastname", 25 );
		Professor professorUpdate = new Professor( 8, 2, "TestnameUpdate", "TestLastnameUpdate", 30 );
		
		Specialization specialization = new Specialization( 5, "Java Connections", "Testdescription", timestamp );
		Specialization specializationUpdate = new Specialization( 5, "TestSpecialization", "Testdescription",
				timestamp );
		
		Student student = new Student( 5, "TestStudent", "TestStudent", 15 );
		Student studentUpdate = new Student( 5, "TestStudentUpdate", "TestStudentUpdate", 20 );
		
		Video video = new Video( 5, 8, "testVideo", "testVideo", 12 );
		Video videoUpdate = new Video( 5, 3, "testVideoUpdate", "testVideoUpdate", 10 );
		//ImpCategory
        /*
        LOGGER.info( "Get index 1: " + impCategory.get( 1 ));
        
        LOGGER.info( "GetAll " + impCategory.getAll() );
        
        LOGGER.info( "Save: " );
        impCategory.save( cat );
        LOGGER.info( "Update: " );
        impCategory.update( catUpdate );
        
        LOGGER.info( "Delete: ");
        impCategory.delete( cat );
        */
		
		//ImpCollege
        /*
        LOGGER.info( "Get index 1: " + impCollege.get( 1 ));
        
        LOGGER.info( "GetAll " + impCollege.getAll() );
        
        LOGGER.info( "Save: " );
        impCollege.save( college );
        LOGGER.info( "Update: " );
        impCollege.update( collegeupdate );
        LOGGER.info( "Delete: ");
        impCollege.delete( collegeupdate );
         */
		
		//ImpCourse
        /*
        LOGGER.info( "Get index 1: " + impCourse.get( 5 ));
    
        LOGGER.info( "GetAll " + impCourse.getAll() );
    
        LOGGER.info( "Save: " );
        impCourse.save( course );
        LOGGER.info( "Update: " );
        impCourse.update( courseupdate );
        LOGGER.info( "Delete: ");
        impCourse.delete( courseupdate );
         */
		
		//ImpHosting
        /*
        LOGGER.info( "Get index 1: " + impHosting.get( 5 ));
    
        LOGGER.info( "GetAll " + impHosting.getAll() );
    
        LOGGER.info( "Save: " );
        impHosting.save( hosting );
        LOGGER.info( "Update: " );
        impHosting.update( hostingupdate );
        LOGGER.info( "Delete: ");
        impHosting.delete( hostingupdate );
         */
		
		//ImpsLearningPath
        /*
        LOGGER.info( "Get index 1: " + impLearningPath.get( 2 ));
        
        LOGGER.info( "GetAll " + impLearningPath.getAll() );
        
        LOGGER.info( "Save: " );
        impLearningPath.save( learningPath );
        LOGGER.info( "Update: " );
        impLearningPath.update( learningPathupdate );
        LOGGER.info( "Delete: ");
        impLearningPath.delete( learningPath );
         */
		
		//ImpProfessor
        /*
		LOGGER.info( "Get index 1: " + impProfessor.get( 2 ));
		
		LOGGER.info( "GetAll " + impProfessor.getAll() );
		
		LOGGER.info( "Save: " );
		impProfessor.save( professor );
		LOGGER.info( "Update: " );
		impProfessor.update( professorUpdate );
		LOGGER.info( "Delete: ");
		impProfessor.delete( professorUpdate );
         */
		
		//ImpSpecialization
		/*
		LOGGER.info( "Get index 1: " + impSpecialization.get( 2 ));
		
		LOGGER.info( "GetAll " + impSpecialization.getAll() );
		
		LOGGER.info( "Save: " );
		impSpecialization.save( specialization );
		LOGGER.info( "Update: " );
		impSpecialization.update( specializationUpdate );
		LOGGER.info( "Delete: ");
		impSpecialization.delete( specializationUpdate );
		
		 */
		
		//ImpStudent
		/*
		LOGGER.info( "Get index 1: " + impStudent.get( 2 ));
		
		LOGGER.info( "GetAll " + impStudent.getAll() );
		
		LOGGER.info( "Save: " );
		impStudent.save( student );
		LOGGER.info( "Update: " );
		impStudent.update( studentUpdate );
		LOGGER.info( "Delete: ");
		impStudent.delete( studentUpdate );
		
		 */
		
		//ImpVideo
		/*
		LOGGER.info( "Get index 1: " + impVideo.get( 2 ));
		
		LOGGER.info( "GetAll " + impVideo.getAll() );
		
		LOGGER.info( "Save: " );
		impVideo.save( video );
		LOGGER.info( "Update: " );
		impVideo.update( videoUpdate );
		LOGGER.info( "Delete: ");
		impVideo.delete( videoUpdate );
		 */
	}
}
