package mybatis.service.runner;

import entities.College;
import mybatis.connection.ConnectionBuilder;
import mybatis.mapper.CollegeMapper;
import org.apache.ibatis.session.SqlSession;

import java.sql.Timestamp;
import java.util.logging.Logger;

public class CollegeRunner{
	public static void main( String[] args ){
		Logger LOGGER = Logger.getLogger( CollegeRunner.class.getName( ) );
		long now = System.currentTimeMillis( );
		Timestamp timestamp = new Timestamp( now );
		College college = new College( "MyBatisCollege", timestamp );
		College collegeupdate = new College( "MyBatisCollegeUpdate", timestamp, 8 );
		
		try( SqlSession session = new ConnectionBuilder( ).buildConnection( ) ){
			session.getMapper( CollegeMapper.class ).save( college );
			LOGGER.info( "CourseMapper Save" );
			session.getMapper( CollegeMapper.class ).update( collegeupdate );
			LOGGER.info( "CourseMapper Update" );
			session.getMapper( CollegeMapper.class ).deleteById( 5 );
			LOGGER.info( "CourseMapper Delete" );
			System.out.println( session.getMapper( CollegeMapper.class ).getById( 15 ) );
			LOGGER.info( "CourseMapper Get By Id" );
			System.out.println( session.getMapper( CollegeMapper.class ).getAll( ) );
			LOGGER.info( "CourseMapper Get All Categories" );
			
			session.commit( );
		}
	}
}
