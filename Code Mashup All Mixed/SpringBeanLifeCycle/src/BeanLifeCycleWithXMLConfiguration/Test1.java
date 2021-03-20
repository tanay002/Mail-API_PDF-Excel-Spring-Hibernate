package BeanLifeCycleWithXMLConfiguration;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Bean1.xml");

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Bean1.xml");

		StudentDao1 s=context.getBean("studentDao1",StudentDao1.class);
		System.out.println(s);
	 s.selectAllRow();
	//	s.deleteStudentRecord(6);
		
//	context.close();    // java.lang.IllegalStateException: BeanFactory not initialized or already closed // line number is metter
//when we call bean object multiple time
	 
	context.registerShutdownHook();//line number is not metter
	 StudentDao1 s1=context.getBean("studentDao1",StudentDao1.class);
	
	 
	 //multiple classes example
	 MultipleClass m=context.getBean("hello",MultipleClass.class);
		System.out.println(m);
	}

}
