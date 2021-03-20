package AllFatchingHBM;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FatchingS1 
{
	public static void main(String[] args)
	{
		
		Configuration cfg=new Configuration();
		cfg.configure("JoinCriteria.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
	
		Criteria crt=ses.createCriteria(ComPanyFatch1.class);
		List<ComPanyFatch1> list=crt.list();
		for(ComPanyFatch1 c:list)
		{
			//System.out.println(c.getName());
			System.out.println(c.getEmp());
		}
	
		EmployeeFatch11 e11=new EmployeeFatch11();    
	  e11.setFirstName("Nikku");
	    e11.setLastName("Swqe");
	    //System.out.println("First Emp");
	    
	    EmployeeFatch11 e12=new EmployeeFatch11();    
	    e12.setFirstName("kuku");
	    e12.setLastName("adx");
	    System.out.println("Second Emp");
	    
	    EmployeeFatch11 e13=new EmployeeFatch11();    
	    e13.setFirstName("riku");    
	    e13.setLastName("pakaw");
	    System.out.println("Third Emp");
		
		   ArrayList<EmployeeFatch11> list2=new ArrayList<EmployeeFatch11>();    
		    list2.add(e11);    
		    list2.add(e12);    
		    list2.add(e13);    
		   
		   
		   ComPanyFatch1 c=new ComPanyFatch1();
			c.setcId((long) 101);
		   c.setCname("Flipcard");
	     	c.setEmp(list2);	
	    
//		ses.save(c);   
	   
	//    tx.commit();    
	
		ses.close();    
	    System.out.println("success"); 	
	}
}
