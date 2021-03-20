package com.SpringBeanAutowireing.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringBeanAutowireing.Autowiring.ByName.StudentDtoByName;


public class MainByConstructor {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("StudentDtoByConstructor.xml");
		StudentDtoByConstructor c=(StudentDtoByConstructor)context.getBean("std1");
		System.out.println(c);
	
	}

}
