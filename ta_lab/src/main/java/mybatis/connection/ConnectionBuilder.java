package mybatis.connection;

import mybatis.mapper.*;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;

public class ConnectionBuilder{
	public SqlSession buildConnection() {
		DataSource dataSource = new PooledDataSource("com.mysql.cj.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/ta_lab",
				"root", "43346918Uli");
		
		Environment environment = new Environment("Development", new JdbcTransactionFactory(), dataSource);
		
		Configuration configuration = new Configuration(environment);
		configuration.addMapper( CategoryMapper.class );
		configuration.addMapper( CollegeMapper.class );
		configuration.addMapper( CourseMapper.class );
		configuration.addMapper( HostingMapper.class );
		configuration.addMapper( LearningPathMapper.class );
		configuration.addMapper( ProfessorMapper.class );
		configuration.addMapper( SpecializationMapper.class );
		configuration.addMapper( StudentMapper.class );
		configuration.addMapper( VideoMapper.class );
		//always add mappers to configuration
		
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(configuration);
		
		return factory.openSession();
	}
}
