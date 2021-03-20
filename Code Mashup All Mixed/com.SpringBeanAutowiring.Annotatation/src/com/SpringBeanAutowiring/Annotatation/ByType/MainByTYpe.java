package com.SpringBeanAutowiring.Annotatation.ByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainByTYpe {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("MainByType.xml");
		StudentDtoByType c=(StudentDtoByType)context.getBean("std1");
		System.out.println(c);
	
		
	}

}
