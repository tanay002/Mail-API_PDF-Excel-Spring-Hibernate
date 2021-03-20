package Difference;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Employee {

	public static void main(String[] args) {
		EmployeeDto e=new EmployeeDto();
		//e.setEid(109);
		
		Configuration con=new Configuration();
		con.configure("ConfigA.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		e.setEname("pooja");
		
		//ses.save(e);
		//ses.persist(e);
		tx.commit();
	//ses.save(e);
		ses.persist(e);
		ses.close();
		System.out.println("Done");
		
	}
}
