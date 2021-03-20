package com.predefineSet;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.PredefinedList.EmployeeDto;

public class PredefinedSet {

	public static void main(String[] args) {
		ClassPathResource r=new ClassPathResource("PredefinedSet.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        EmployeeDto1 s=(EmployeeDto1)factory.getBean("emp1");  
        System.out.println(s);
	
	}

}
