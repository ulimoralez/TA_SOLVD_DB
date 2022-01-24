package runners;

import entities.Category;
import mybatis.service.CategoryMyBatisService;
import services.interfaces.IDAO;


public class FactoryRunner{
	public static void main( String[] args ){
		IDAO< Category > categoryIDAOJDBC = new CategoryMyBatisService( );
	}
}
