package ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import OneToOneMapping.Address;
import OneToOneMapping.Employee;

public class User2 {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("OneToMany.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		ManyAnswer ma=new ManyAnswer();
		ma.setAns("OOps");
		
		ManyAnswer ma11=new ManyAnswer();
		ma11.setAns("Java");
		
		Question1 q=new Question1();                                    //one question 2 answer
		q.setQues("What is Language");
		  List<ManyAnswer> l1=new ArrayList<ManyAnswer>();  
		    l1.add(ma);  
		    l1.add(ma11);  
		    q.setQa(l1);
		    
		    
		    
		ManyAnswer ma2=new ManyAnswer();
		ma2.setAns("Servlet is interface");
		
		ManyAnswer ma3=new ManyAnswer();
		ma3.setAns(" interface");
		
		Question1 q1=new Question1();                                    //one question 2 answer
		q1.setQues("What is Servlete");
		  ArrayList<ManyAnswer> l2=new ArrayList<ManyAnswer>();  
		    l2.add(ma2);  
		    l2.add(ma3);  
		    q1.setQa(l2);
		
			ses.save(q);
			ses.save(q1);	
		tx.commit();
		ses.close();
		System.out.println("Done");
	}
	}

