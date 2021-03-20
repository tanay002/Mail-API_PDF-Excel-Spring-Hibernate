package CallFunctionParamerter;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Factory {

	public static void main(String[] args) {

		
	/*	  Productdto d=new Productdto(); 
		  d.setPrice(45000);
		  d.setProName("Semsung");
		 
		  Productdto d1=new Productdto(); 
		  d1.setPrice(35000);
		  d1.setProName("Dell");
		 
		  Productdto d2=new Productdto(); 
		  d2.setPrice(55000);
		  d2.setProName("Lenovo");
		 
		  Productdto d3=new Productdto(); 
		  d3.setPrice(65000);
		  d3.setProName("HP");
	*/	 
		  
		  
		AnnotationConfiguration con = new AnnotationConfiguration();
		con.configure("QueryConfigue.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		

		//HQL Named Query Example
				Query 
				query = ses.getNamedQuery("Query_Ka_naam_kuch_b");
				List<Productdto> proList = query.list();
				for (Productdto pr : proList) {
					System.out.println("List of product::" + pr.getProductId() + ","
							+ pr.getProName()+","+pr.getPrice());
				}
		
		
	/*ses.save(d);
	ses.save(d1);
	ses.save(d2);
	ses.save(d3);
	*/
	tx.commit();
		ses.close();
		System.out.println("Done");

	}

}
