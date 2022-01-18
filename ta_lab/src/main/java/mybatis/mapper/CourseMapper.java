package mybatis.mapper;

import entities.College;
import entities.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CourseMapper{
	String table = "Course";
	@Insert("INSERT INTO "+table+" (description, duration_hs, name) values (#{description}, ${durationHS}, #{name})")
	void save( Course course);
	
	@Update("UPDATE "+table+" SET name=#{name}, description=#{description}, duration_hs=#{durationHS} WHERE " +
			"courseId=#{id}")
	void update(Course course);
	
	@Delete("DELETE FROM "+table+" WHERE courseId=#{id}")
	void deleteById(int courseId);
	
	@Select("SELECT * FROM "+table+" WHERE "+table+".courseId = #{courseId}")
	@Results(value = {
			@Result(property = "id", column = "courseId"),
			@Result(property = "learningPathId", column = "learningPathId"),
			@Result(property = "name", column = "name"),
			@Result(property = "durationHS", column = "duration_hs"),
	})
	Course getById(int courseId);
	
	@Select("SELECT * FROM "+table)
	@Results(value = {
			@Result(property = "id", column = "courseId"),
			@Result(property = "learningPathId", column = "learningPathId"),
			@Result(property = "name", column = "name"),
			@Result(property = "durationHS", column = "duration_hs"),
	})
	List<Course> getAll();
}
