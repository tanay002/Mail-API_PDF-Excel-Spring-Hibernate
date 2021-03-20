package NamedQuery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Factory {

	public static void main(String[] args) {

		
		  Productdto d=new Productdto(); 
		  d.setPrice(45000);
		  d.setProName("Semsung");
		 
		AnnotationConfiguration con = new AnnotationConfiguration();
		con.configure("QueryConfigue.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		

		//HQL Named Query Example
				Query query = ses.getNamedQuery("Query_Ka_naam_kuch_b");
				List<Productdto> proList = query.list();
				for (Productdto pr : proList) {
					System.out.println("List of product::" + pr.getProductId() + ","
							+ pr.getProName()+","+pr.getPrice());
				}
		
		
	ses.save(d);
	tx.commit();
		ses.close();
		System.out.println("Done");

	}

}
