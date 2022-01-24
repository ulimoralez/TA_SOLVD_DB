package mybatis.mapper;

import entities.College;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CollegeMapper{
	@Insert( "INSERT INTO College (name, foundation_age) VALUES (#{name}, #{foundationAge})" )
	void save( College college );
	
	@Update( "UPDATE College SET name=#{name}, foundation_age=#{foundationAge} WHERE collegeId=#{id}" )
	void update( College college );
	
	@Delete( "DELETE FROM College WHERE collegeId=#{id}" )
	void deleteById( int collegeId );
	
	@Select( "SELECT * FROM College WHERE College.collegeId = #{collegeId}" )
	@Results( value = {
			@Result( property = "id", column = "collegeId" ),
			@Result( property = "name", column = "name" ),
			@Result( property = "foundationAge", column = "foundation_age" )
	} )
	College getById( int collegeId );
	
	@Select( "SELECT * FROM College" )
	@Results( value = {
			@Result( property = "id", column = "collegeId" ),
			@Result( property = "name", column = "name" ),
			@Result( property = "foundationAge", column = "foundation_age" )
	} )
	List< College > getAll( );
}
