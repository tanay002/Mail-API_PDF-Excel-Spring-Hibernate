package OneToOneMapping;


//List Program using PreDefined datatype

import java.applet.AppletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class OneToOne {

	public static void main(String[] args) {
	
		   
		
		 Resource resource=new ClassPathResource("OneToOneAppCon.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		
		 StudentDto1 std = ( StudentDto1)factory.getBean("student");
	        System.out.println(std);
	          
		
	}

}
