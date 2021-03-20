package OneToOneMapping.Using.UserDefined.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import HasARelationship.Setter.StudentDto;

public class School11 {

	public static void main(String[] args) {
	
		Resource resource=new ClassPathResource("OneToOneUserDList.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    StudentDto11 student=(StudentDto11)factory.getBean("student");
	    System.out.println(student.getSname()+" "+student.getSid()+"  "+student.getAd());

	}

}
