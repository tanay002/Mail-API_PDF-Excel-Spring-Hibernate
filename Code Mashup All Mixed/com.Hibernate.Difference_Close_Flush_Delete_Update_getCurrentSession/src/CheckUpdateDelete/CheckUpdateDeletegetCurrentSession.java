package CheckUpdateDelete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import DifferenceCheck.CheckDto;

public class CheckUpdateDeletegetCurrentSession {

	public static void main(String[] args) {
		
	
	CheckDto c=new CheckDto();
	//c.setCid(101);
	c.setCname("hf");
	
	
	AnnotationConfiguration con=new AnnotationConfiguration();
	con.configure("Check.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	//Session session=sf.getCurrentSession();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();

	System.out.println("Start");

//get method me object me key denge or nahi milegi to null pointer exception throw karega
//CheckDto c1=(CheckDto)session.get(CheckDto.class,8);    

	//load method me object me key denge or nahi milegi to ObjectNotFoundException throw karega
		
//	UseStateMethod b1=(UseStateMethod)session.load(UseStateMethod.class,130);    
	/*System.out.println(c1.getCname());                                
	System.out.println("End");	

*/
	
	 // DELETE OPERATION
    // Transaction object is required for all operations except fetching records

  // session.delete(c1);     //delete data from database
    
    // UPDATE OPERATION
	/*c1.setCname("Chita");
	session.update(c1);
	*/

	
	
	
	//Persistent
session.save(c);
	//session.update(c);
	CheckDto c1=new CheckDto();
	//c.setCid(101);
	c1.setCname("ppppppppp");
	//session.close();
	session.flush();
	tx.commit();	
	session.close();

	//session.flush();  //flush karne pr database me data save nhi hota h
	System.out.println("Done");
}


}	
