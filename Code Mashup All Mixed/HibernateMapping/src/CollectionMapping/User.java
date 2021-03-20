package CollectionMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class User {

	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure("OneToMany.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		Answer a=new Answer();
		a.setAnsName(" Java is Programming language");
		
		Answer a1=new Answer();
		a1.setAnsName("It is opps Program");
		

		
		List l=new ArrayList();
		l.add(a);
		l.add(a1);
	
		Question q=new Question();
		q.setqName("What is java");
		q.setAns(l);
		
		
		
		
		ses.save(q);
		tx.commit();
		ses.close();
		System.out.println("Done");
	}


		
	}


