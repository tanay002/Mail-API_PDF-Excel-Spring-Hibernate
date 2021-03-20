package com.SpringBeanAutowireing.Autowiring.AutoDetect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainAutoDetect {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("StudentDtoAutoDetect.xml");
		StudentDtoAutoDetect c=(StudentDtoAutoDetect)context.getBean("std1");
		System.out.println(c);
	
		
	}

}
