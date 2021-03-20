package OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Company {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("OneTOManyAnotation.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		Employee e1=new Employee();    
	    e1.seteName("Saurabh");    
	    e1.seteName("Sakshi");
	    
	    
	    Employee e2=new Employee();    
	    e2.seteName("Suraj");    
	    e2.seteName("Swati");
	   
	    
	    
	    List list=new ArrayList();
	    list.add(e1);
	    list.add(e2);
	    
	    Address address1=new Address();    
	    address1.setCity("Indore");   
	    
	    address1.setEmp(list);   
	        
	    ses.persist(address1);
	//   ses.persist(e1);    
	    tx.commit();    
	        
	    ses.close();    
	    System.out.println("success"); 
		

		
	}

}
