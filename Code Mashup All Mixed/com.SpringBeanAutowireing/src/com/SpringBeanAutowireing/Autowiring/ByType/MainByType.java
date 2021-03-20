package com.SpringBeanAutowireing.Autowiring.ByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainByType {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("StudentDtoByType.xml");
		StudentDtoByType c=(StudentDtoByType)context.getBean("std1");
		System.out.println(c);
	
		
	}

}
