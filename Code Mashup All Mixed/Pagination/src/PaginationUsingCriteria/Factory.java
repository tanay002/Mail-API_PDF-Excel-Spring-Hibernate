package PaginationUsingCriteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Factory {
	
	public static void main(String[] args) {

		 int paginatedCount = 0;
		 int firstResult=2;//2 no.ko chod kr next se start karega or 3,4,5,6 row print karayega
		 int maxResults=4;
		
		
	/*	  Productdto d=new Productdto(); 
		  d.setPrice(45000);
		  d.setProName("Semsung");
	*/	 
		AnnotationConfiguration con = new AnnotationConfiguration();
		con.configure("PaginationCriteria.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		

		   Criteria criteria = ses.createCriteria(Productdto.class);
           criteria.setFirstResult(firstResult);
           criteria.setMaxResults(maxResults);
           List<Productdto> proList = (List) criteria.list();
           if (proList != null) {
               paginatedCount = proList.size();
               System.out.println("Total Results: " + paginatedCount);
               for (Productdto pr : proList) {
					System.out.println("List of product::" + pr.getProductId() + ","
							+ pr.getProName()+","+pr.getPrice());
				}
						System.out.println(paginatedCount);
		
	//ses.save(d);
	//tx.commit();
		ses.close();
		System.out.println("Done");

	}
	}
}