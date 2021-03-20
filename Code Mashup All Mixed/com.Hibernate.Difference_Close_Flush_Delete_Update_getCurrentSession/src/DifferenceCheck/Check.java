package DifferenceCheck;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



public class Check {

	public static void main(String[] args) {
	
		CheckDto c=new CheckDto();
		//c.setCid(101);
		c.setCname("Swati");
		
		
		AnnotationConfiguration con=new AnnotationConfiguration();
		con.configure("Check.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		//Session session=sf.getCurrentSession();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
	
		System.out.println("Start");

//get method me object me key denge or nahi milegi to null pointer exception throw karega
	CheckDto c1=(CheckDto)session.get(CheckDto.class,1);    

		//load method me object me key denge or nahi milegi to ObjectNotFoundException throw karega
			
//		UseStateMethod b1=(UseStateMethod)session.load(UseStateMethod.class,130);    
		System.out.println(c1.getCname());                                
		System.out.println("End");	

	
		
		//Persistent
session.save(c);
		tx.commit();
		//session.close();
		session.flush();  //flush karne pr database me data save nhi hota h
		
		System.out.println("Done");
}

}
