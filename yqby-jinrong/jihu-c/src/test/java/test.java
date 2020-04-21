import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yqbing.servicebing.service.impl.StoreHouseServiceImpl;


public class test {
    
	
	
	@Test
	public void test112(){
		String saf = StringUtils.substringAfterLast("78MB", "MB");
		   
		   System.out.println(saf);
	}
	 public static void main(String[] args) {
		   
		   
		   
	  }
}
