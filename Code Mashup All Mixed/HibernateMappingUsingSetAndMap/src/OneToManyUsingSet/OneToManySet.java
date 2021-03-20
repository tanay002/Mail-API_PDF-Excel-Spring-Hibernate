package OneToManyUsingSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class OneToManySet {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("OneToManySet.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		Employee e1=new Employee();    
	    e1.seteName("Nandu");    
	    
	    Employee e2=new Employee();    
	    e2.seteName("Pooja");    
	    
	    Set l=new HashSet();
	    l.add(e1);
	    l.add(e2);
	    
	    Address address1=new Address();    
	    address1.setCity("Indore");   
	        
	    address1.setEmp(l);   
	        
	    ses.persist(address1);
	   ses.persist(e1);    
	    tx.commit();    
	        
	    ses.close();    
	    System.out.println("success"); 
		


	}

}
