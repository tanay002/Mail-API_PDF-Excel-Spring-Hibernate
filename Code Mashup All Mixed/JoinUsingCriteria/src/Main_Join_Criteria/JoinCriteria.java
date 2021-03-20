package Main_Join_Criteria;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class JoinCriteria {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("OneTOManyAnotation.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
	
		ComPany c=new ComPany();
		//c.getBenefits();
		c.setName("OpenDox");
		
	
		  Benifit bn=new Benifit();
		   bn.setName("30% Profit");
		   bn.setCompany(c);
		   
		   Benifit bn1=new Benifit();
		   bn1.setName("90% profit");
		   bn1.setCompany(c);
		   
		   Benifit bn2=new Benifit();
		   bn2.setName("50% profit");
		   bn2.setCompany(c);
		 
		   Benifit bn3=new Benifit();
		   bn3.setName("70% profit");
		   bn3.setCompany(c);
		 
		   
		   Set<Benifit> bt = new HashSet<Benifit>();
           bt.add(bn);
           bt.add(bn1);
          
           Set<Benifit> bt1 = new HashSet<Benifit>();
           bt1.add(bn2);
           bt1.add(bn3);
          
           Set<Benifit> bt2 = new HashSet<Benifit>();
           bt2.add(bn1);
           bt2.add(bn3);
           
           c.setBenefits(bt1);
   		
		Employee e1=new Employee();    
	    e1.setFirstName("Saurabh");
	    e1.setLastName("Sing");
	    e1.setCompany(c);
	    e1.setBenefits(bt);
	    
	    Employee e=new Employee();    
	    e.setFirstName("Swati");
	    e.setLastName("Sing");
	    e.setCompany(c);
	    e.setBenefits(bt2);
	    
	    Employee e2=new Employee();    
	    e2.setFirstName("Sakshi");    
	    e2.setFirstName("Wadurkar");
	   e2.setCompany(c);
	   e2.setBenefits(bt1);
	   
	 
	   
	   
	    ses.save(bn);
	    ses.save(bn1);
	    ses.save(bn2);
	    ses.save(bn3);
	    ses.save(e);
	    ses.save(e1);
	    ses.save(e2);
	    ses.save(c);
	    
	    
	  
	   
	   
	//   ses.persist(e1);    
	    tx.commit();    
	        
	    ses.close();    
	    System.out.println("success"); 
		

		
	}

}
