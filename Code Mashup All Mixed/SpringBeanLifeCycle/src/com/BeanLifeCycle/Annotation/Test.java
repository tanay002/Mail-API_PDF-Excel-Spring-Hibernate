package com.BeanLifeCycle.Annotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		StudentDao s=context.getBean("studentDao",StudentDao.class);
		System.out.println(s);
		s.selectAllRow();
	//	s.deleteStudentRecord(6);
		
		((ClassPathXmlApplicationContext)context).close();
}
}
