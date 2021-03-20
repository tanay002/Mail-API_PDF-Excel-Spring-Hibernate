package callParameterProcedure;


import javax.persistence.*;

import org.hibernate.classic.Session;


public class Factory1 {
	
	public static void main(String[] args) {

/*		
		  Productdto1 d=new Productdto1(); 
		  d.setPrice(45000);
		  d.setProName("Semsung");
		 
		  Productdto1 d1=new Productdto1(); 
		  d1.setPrice(35000);
		  d1.setProName("Dell");
		 
		  Productdto1 d2=new Productdto1(); 
		  d2.setPrice(55000);
		  d2.setProName("Lenovo");
		 
		  Productdto1 d3=new Productdto1(); 
		  d3.setPrice(65000);
		  d3.setProName("HP");
		 */
		  
		try{
		   EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
	     	
EntityManager en=emf.createEntityManager();
en.getTransaction().begin();
Session ses=en.unwrap(Session.class);
		
	StoredProcedureQuery query = en.createNamedStoredProcedureQuery("productdto1");		
		query.registerStoredProcedureParameter( "productId",  Integer.class, ParameterMode .IN);
		query.registerStoredProcedureParameter( "price", Integer.class, ParameterMode.OUT);
			query.setParameter("productId", 2);
			query.execute();
	Integer p=(Integer)query.getOutputParameterValue("price");
		System.out.println("price:"+p);
		
		
		
			
		/*ses.save(d);
	ses.save(d1);
	ses.save(d2);
	ses.save(d3);
	*/
	en.getTransaction().commit();
		en.close();
		System.out.println("Done");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
