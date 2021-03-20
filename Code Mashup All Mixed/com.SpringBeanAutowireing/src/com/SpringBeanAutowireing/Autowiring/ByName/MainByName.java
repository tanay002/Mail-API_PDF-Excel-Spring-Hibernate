package com.SpringBeanAutowireing.Autowiring.ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainByName {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("StudentDtoByName.xml");
		StudentDtoByName c=(StudentDtoByName)context.getBean("std1");
		System.out.println(c);
	
		
	}

}
