package SetUsingPredefined;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import OneToOneMapping.StudentDto1;

public class School12 {

	public static void main(String[] args) {
	
		 Resource resource=new ClassPathResource("SetUsingPredefined.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		
		    StudentDto12 std = ( StudentDto12)factory.getBean("student");
	        System.out.println(std);
	    
	}

}
