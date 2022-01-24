package mybatis.service.runner;

import entities.Course;
import mybatis.connection.ConnectionBuilder;
import mybatis.mapper.CourseMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.logging.Logger;

public class CourseRunner{
	public static void main( String[] args ){
		Logger LOGGER = Logger.getLogger( CourseRunner.class.getName( ) );
		Course course = new Course( 1, 1, "MyBatisCourse", "MyBatisCourse Insert", 5 );
		Course courseupdate = new Course( 3, 1, 1, "TestUpdatedCourse", "TestUpdatedCourse", 5 );
		
		try( SqlSession session = new ConnectionBuilder( ).buildConnection( ) ){
			session.getMapper( CourseMapper.class ).save( course );
			LOGGER.info( "CourseMapper Save" );
			session.getMapper( CourseMapper.class ).update( courseupdate );
			LOGGER.info( "CourseMapper Update" );
			session.getMapper( CourseMapper.class ).deleteById( 5 );
			LOGGER.info( "CourseMapper Delete" );
			System.out.println( session.getMapper( CourseMapper.class ).getById( 22 ) );
			LOGGER.info( "CourseMapper Get By Id" );
			
			
			session.commit( );
		}
	}
}
