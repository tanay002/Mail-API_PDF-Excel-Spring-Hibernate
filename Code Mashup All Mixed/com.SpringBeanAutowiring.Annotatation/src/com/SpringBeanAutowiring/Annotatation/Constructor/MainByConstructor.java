package com.SpringBeanAutowiring.Annotatation.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainByConstructor {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("MainByConstructor.xml");
		StudentDtoByConstructor c=(StudentDtoByConstructor)context.getBean("std1");
		System.out.println(c);
	
		
	}

}
