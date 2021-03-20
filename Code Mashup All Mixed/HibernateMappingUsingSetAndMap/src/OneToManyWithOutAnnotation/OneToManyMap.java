package OneToManyWithOutAnnotation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import OneToManyUsingSet.Address;
import OneToManyUsingSet.Employee;

public class OneToManyMap {

	public OneToManyMap() {}

		public static void main(String[] args) {
			
			AnnotationConfiguration cfg=new AnnotationConfiguration();
			cfg.configure("OneToManyMapWithoutAnotation.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session ses=sf.openSession();
			Transaction tx=ses.beginTransaction();
			
			Employee2 e1=new Employee2();    
		    e1.seteName("Nandu");    
		    
		    Employee2 e2=new Employee2();    
		    e2.seteName("Pooja");    
		    
		    Map m=new HashMap();
		    m.put(101,e1 );
		    m.put(102,e2);
		    
		    Address2 address1=new Address2();    
		    address1.setCity("Indore");   
		        
		    address1.setEmp(m);   
		        
		    ses.persist(address1);
		   ses.persist(e1);    
		    tx.commit();    
		        
		    ses.close();    
		    System.out.println("success"); 
			


		}
}


