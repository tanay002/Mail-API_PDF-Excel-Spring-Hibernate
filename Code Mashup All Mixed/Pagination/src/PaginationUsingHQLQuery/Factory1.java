package PaginationUsingHQLQuery;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import PaginationUsingCriteria.Productdto;

public class Factory1 {

	public static void main(String[] args) {
	
		AnnotationConfiguration con = new AnnotationConfiguration();
		con.configure("PaginationCriteria.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		

		
		  String HQL_QUERY = "FROM Productdto";
		  Query query = ses.createQuery(HQL_QUERY);
		  query.setFirstResult(1);//set first result start value
		  query.setMaxResults(4);//number of result to be display
		  
		 
		  List<Productdto> proList = query.list();
			for (Productdto pr : proList) {
				System.out.println("List of product::" + pr.getProductId() + ","
						+ pr.getProName()+","+pr.getPrice());
			} 
		
		
		
		
		
		
	//ses.save(d);
	//tx.commit();
		ses.close();
		System.out.println("Done");

	}
	

		
		
	}

