import connection.DBConnection;
import domain.Category;
import domain.College;
import domain.Course;
import implementation.ImpCategory;
import implementation.ImpCollege;
import implementation.ImpCourse;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Logger;

public class Runner {
    public static void main(String[] args) {
        
        final Logger LOGGER = Logger.getLogger(Runner.class.getName());
        long now = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp( now );
        
        ImpCategory impCategory = new ImpCategory();
        ImpCollege impCollege = new ImpCollege();
        ImpCourse impCourse = new ImpCourse();
    
        Category cat = new Category( "TestCategory", "TestInsertion" );
        Category catUpdate = new Category( 5, "TestCategoryUpdated", "TestInsertion" );
    
        
        College college = new College( "EEE", timestamp );
        College collegeupdate = new College( "WWW", timestamp, 6 );
        
        Course course = new Course( 1, 1, "Java advanced", "Learn about java in depth", 5 );
        Course courseupdate = new Course( 3, 1, 1, "TestUpdatedCourse", "TestUpdatedCourse", 5 );
    
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
        LOGGER.info( "Get index 1: " + impCourse.get( 5 ));
    
        LOGGER.info( "GetAll " + impCourse.getAll() );
    
        LOGGER.info( "Save: " );
        impCourse.save( course );
        LOGGER.info( "Update: " );
        impCourse.update( courseupdate );
        LOGGER.info( "Delete: ");
        impCourse.delete( courseupdate );
    }
}
