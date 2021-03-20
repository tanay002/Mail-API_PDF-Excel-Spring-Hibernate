package com.SpringBeanAutowiring.Annotatation.ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainByName {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("MainByName.xml");
		StudentDtoByName c=(StudentDtoByName)context.getBean("std1");
		System.out.println(c);
	
	}

}
