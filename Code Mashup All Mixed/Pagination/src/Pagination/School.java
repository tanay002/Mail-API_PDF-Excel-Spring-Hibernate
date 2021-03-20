package Pagination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import javax.persistence.*;  

public class School {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("Pagination.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		 
		
		 //Hibernate Named Query    
      Query query = ses.getNamedQuery("findStudentByName");    
         query.setParameter("name","amit");   
                 
         List std=query.list();   
        try
        {
        //pagination	
        	/*
        	Query q = ses.createQuery("from Student");
            q.setFirstResult(0);
            q.setMaxResults(2);
            std = q.list();                // first two records, 0 and 1
            */        
        	
        //pagination	
        	Criteria ct=ses.createCriteria(Student.class);
        	ct.setFirstResult(0);
            ct.setMaxResults(2);
            std = ct.list();                // first two records, 0 and 1
            
         
 Iterator<Student> itr=std.iterator();    
  while(itr.hasNext()){    
 Student s=itr.next();    
 System.out.println(s);    
  }    }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	//	ses.save(query);
		tx.commit();    
	        
	    ses.close();    
	    System.out.println("success"); 
		

		

	}

}
