package com.PredefinedList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import SimpleConstructorProgram.Employee;

public class PredefinedList {

	public static void main(String[] args) {
		ClassPathResource r=new ClassPathResource("PredefinedList.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        EmployeeDto s=(EmployeeDto)factory.getBean("emp1");  
        System.out.println(s);
	
	}
}
