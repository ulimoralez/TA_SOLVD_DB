package mybatis.mapper;

import entities.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CategoryMapper{
	@Insert( "INSERT INTO Category (description, name) VALUES (#{description}, #{name})" )
	void save( Category category );
	
	@Update( "UPDATE Category SET name=#{name}, description=#{description} WHERE categoryId=#{id}" )
	void update( Category category );
	
	@Delete( "DELETE FROM category WHERE categoryId=#{id}" )
	void deleteById( int categoryId );
	
	@Select( "SELECT * FROM category WHERE category.categoryId = #{categoryId}" )
	@Results( value = {
			@Result( property = "id", column = "categoryId" ),
			@Result( property = "name", column = "name" ),
			@Result( property = "description", column = "description" )
	} )
	Category getById( int categoryId );
	
	@Select( "SELECT * FROM category" )
	@Results( value = {
			@Result( property = "id", column = "categoryId" ),
			@Result( property = "name", column = "name" ),
			@Result( property = "description", column = "description" )
	} )
	List< Category > getAll( );
}
