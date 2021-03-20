package UserDefinedSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserDefinedSet {

	public static void main(String[] args) {
		
ApplicationContext ap=new ClassPathXmlApplicationContext("UserDefinedSet.xml");
		
		EmployeeDto4 s=(EmployeeDto4)ap.getBean("emp1");  
	    System.out.println(s);

		
	}

}
