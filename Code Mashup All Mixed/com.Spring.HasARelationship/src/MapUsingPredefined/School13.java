package MapUsingPredefined;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class School13 {

	public static void main(String[] args) {
		 Resource resource=new ClassPathResource("MapUsingPredefined.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		
		    StudentDto13 std = ( StudentDto13)factory.getBean("student");
	        System.out.println(std.getSid()+"  "+std.getSname()+"  "+std.getLanguages());
	    
	}

}
