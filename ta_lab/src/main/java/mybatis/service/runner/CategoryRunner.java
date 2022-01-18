package mybatis.service.runner;

import entities.Category;
import mybatis.connection.ConnectionBuilder;
import mybatis.mapper.CategoryMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.logging.Logger;

public class CategoryRunner{
	public static void main( String[] args ){
		Logger LOGGER = Logger.getLogger( CategoryRunner.class.getName() );
		Category category = new Category( 5,"NewCategory", "TestCategoryMyBatis" );
		Category categoryUpdate = new Category( 15, "UpdatedMyBatis", "UpdatedWithMyBatis" );
		
		try( SqlSession session = new ConnectionBuilder().buildConnection() ){
			session.getMapper( CategoryMapper.class ).save( category );
			LOGGER.info( "CategoryMapper Save" );
			session.getMapper( CategoryMapper.class ).update( categoryUpdate );
			LOGGER.info( "CategoryMapper Update" );
			session.getMapper( CategoryMapper.class ).deleteById( 5 );
			LOGGER.info( "CategoryMapper Delete" );
			System.out.println(session.getMapper( CategoryMapper.class ).getById( 15 ) );
			LOGGER.info( "CategoryMapper Get By Id" );
			System.out.println(session.getMapper( CategoryMapper.class ).getAll());
			LOGGER.info( "CategoryMapper Get All Categories" );
			
			session.commit();
		}
	}
}
