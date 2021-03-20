package com.SpringBeanScope.Session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SessionDemo.xml");
		Customer c=(Customer)context.getBean("ses1");
		System.out.println(c);
	}

}
