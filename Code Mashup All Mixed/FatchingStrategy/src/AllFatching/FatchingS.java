package AllFatching;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.criteria.JoinType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
import org.slf4j.LoggerFactory;

public class FatchingS 
{
	public static void main(String[] args)
	{
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("JoinCriteria.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
	
		Criteria crt=ses.createCriteria(ComPanyFatch.class);
		List<ComPanyFatch> list=crt.list();
		for(ComPanyFatch c:list)
		{
			//System.out.println(c.getName());
			System.out.println(c.getEmp());
		}
		
	/*	EmployeeFatch e1=new EmployeeFatch();    
	    e1.setFirstName("Tiku");
	    e1.setLastName("Waq");
	    System.out.println("First Emp");
	    
	    EmployeeFatch e=new EmployeeFatch();    
	    e.setFirstName("Miku");
	    e.setLastName("Qas");
	    System.out.println("Second Emp");
	    
	    EmployeeFatch e2=new EmployeeFatch();    
	    e2.setFirstName("OUY");    
	    e2.setLastName("WDC");
	    System.out.println("Third Emp");
		
		   ArrayList<EmployeeFatch> list2=new ArrayList<EmployeeFatch>();    
		    list2.add(e);    
		    list2.add(e1);    
		    list2.add(e2);    
		   
		   
		   ComPanyFatch c=new ComPanyFatch();
			c.setName("FlipCard");
		c.setEmp(list2);	
		   
    //ses.save(e);
	 //   ses.save(e1);
	 //   ses.save(e2);
	    ses.save(c);
	    
	    
	  
	   
	   
	    tx.commit();    
	*/
		/*
		Criteria crt=ses.createCriteria(ComPanyFatch.class);
		List<ComPanyFatch> list=crt.list();
		for(ComPanyFatch s:list)
		{
			s.getName();
		}
		*/
	    ses.close();    
	    System.out.println("success"); 
		

		
	}

}
