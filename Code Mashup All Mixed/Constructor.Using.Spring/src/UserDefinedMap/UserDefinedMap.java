package UserDefinedMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class UserDefinedMap {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("UserDefinedMap.xml");
				
				EmployeeDto5 s=(EmployeeDto5)ap.getBean("emp1");  
			    System.out.println(s);


	}

}
