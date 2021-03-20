package com.SpringBeanScope.Prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringBeanScope.Singleton.StudentDto;

public class PrototypeDemo {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("PrototypeDemo.xml");
		StudentDto s1=(StudentDto)context.getBean("std1");
		System.out.println(s1.hashCode());
		StudentDto s2=(StudentDto)context.getBean("std1");
		System.out.println(s2.hashCode());
	
	}

}
