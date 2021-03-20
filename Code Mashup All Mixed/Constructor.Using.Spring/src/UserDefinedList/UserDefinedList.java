package UserDefinedList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserDefinedList {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("UserDefinedList.xml");
		
		EmployeeDto3 s=(EmployeeDto3)ap.getBean("emp1");  
	    System.out.println(s);

	}

}
