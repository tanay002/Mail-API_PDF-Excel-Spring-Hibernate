package OneToOneAnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("OneToOne.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		Employee e1=new Employee();    
	    e1.setName("Ravi Malik");    
	    e1.setEmail("ravi@gmail.com");    
	        
	    Address address1=new Address();    
   
	    address1.setState("UP");    
	    address1.setCountry("India");    
	        
	    e1.setAddress(address1);    
	    address1.setEmployee(e1);    
	        
	   ses.persist(e1);    
	    tx.commit();    
	        
	    ses.close();    
	    System.out.println("success"); 
		
	}

}
