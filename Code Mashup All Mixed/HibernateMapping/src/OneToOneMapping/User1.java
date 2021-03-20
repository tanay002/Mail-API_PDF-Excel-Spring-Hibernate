package OneToOneMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import CollectionMapping.Answer;
import CollectionMapping.Question;

public class User1 {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("OneToMany.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		Employee e1=new Employee();
		e1.setEname("Pooja");
		e1.setEname("pihu");
		
		
		Address a=new Address();
		a.setCity("Indore");
		
		e1.setAdd(a);
		a.setEmp(e1);
		
		
			ses.save(e1);
		tx.commit();
		ses.close();
		System.out.println("Done");
	}

		
	}


