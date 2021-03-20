package FirstSpringProgram;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class School {

	public static void main(String[] args) {
	
		
		 Resource resource=new ClassPathResource("ApplicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    StudentDto student=(StudentDto)factory.getBean("std1");
		    System.out.println(student.getSadd()+" "+student.getSname());
	}

}
