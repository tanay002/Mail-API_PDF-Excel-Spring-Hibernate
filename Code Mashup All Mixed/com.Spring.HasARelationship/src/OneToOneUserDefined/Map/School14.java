package OneToOneUserDefined.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class School14 {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("OneToOneUserDefinedMap.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	     
	    MarksDto marks=(MarksDto)factory.getBean("marks");
	    
	   
	    System.out.println(marks.getMaths()+"  "+marks.getAd());

	}

}
