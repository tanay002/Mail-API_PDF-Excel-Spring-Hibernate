package com.SpringBeanScope.Singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonDemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SingletonDemo.xml");
		StudentDto s1=(StudentDto)context.getBean("std1");
		System.out.println(s1.hashCode());
		StudentDto s2=(StudentDto)context.getBean("std1");
		System.out.println(s2.hashCode());
	
	}

}
