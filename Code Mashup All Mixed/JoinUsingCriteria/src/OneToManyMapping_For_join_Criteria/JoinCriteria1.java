package OneToManyMapping_For_join_Criteria;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.criteria.JoinType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
import org.slf4j.LoggerFactory;

public class JoinCriteria1 {

	private static SessionFactory sf;
	 
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SessionFactory.class);
 
    private static Session ses;
	
    
    
       
	
	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("JoinCriteria.cfg.xml");
		 sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
	
		ComPany1 c=new ComPany1();
		
		c.setName("Amazon");
		
	
		  Benifit1 bn=new Benifit1();
		   bn.setName("40% Profit");
		   bn.setCompany(c);
		   
		   Benifit1 bn1=new Benifit1();
		   bn1.setName("80% profit");
		   bn1.setCompany(c);
		   
		   Benifit1 bn2=new Benifit1();
		   bn2.setName("60% profit");
		   bn2.setCompany(c);
		 
		   Benifit1 bn3=new Benifit1();
		   bn3.setName("20% profit");
		   bn3.setCompany(c);
		 
		   
		   Set<Benifit1> bt = new HashSet<Benifit1>();
           bt.add(bn);
           bt.add(bn1);
          
           Set<Benifit1> bt1 = new HashSet<Benifit1>();
           bt1.add(bn2);
           bt1.add(bn3);
          
           Set<Benifit1> bt2 = new HashSet<Benifit1>();
           bt2.add(bn1);
           bt2.add(bn3);
           
           c.setBenefits(bt);
           c.setBenefits(bt1);
           c.setBenefits(bt2);
      		
		Employee1 e1=new Employee1();    
	    e1.setFirstName("Arpit");
	    e1.setLastName("Sahu");
	    e1.setCompany(c);
	    
	    
	    Employee1 e=new Employee1();    
	    e.setFirstName("Ankur");
	    e.setLastName("Sharma");
	    e.setCompany(c);
	    
	    Employee1 e2=new Employee1();    
	    e2.setFirstName("Abhinaye");    
	    e2.setLastName("Sindhe");
		   e2.setCompany(c);
	   
	 
	  Criteria criteria = ses.createCriteria(Employee1.class,"employee");
		   
	        Criteria companyCriteria = criteria.createCriteria();
	        companyCriteria.add(Restrictions.eq("name", "35% Profit"));
	        Criteria benefitsAlias = companyCriteria.createCriteria("benefits",JoinType.LEFT);
	        benefitsAlias.add(Restrictions.sqlRestriction("{alias}.name = ?",benefitName, StringType.INSTANCE));
	 
	        
	        
	        
	        
	        List<Employee1> employees = criteria.list();
	 
	        for(Employee1 employee:employees) {
	            LOGGER.error("The employee is "+employee.getFirstName());
	        }
	 
	   
	   
	    ses.save(bn);
	    ses.save(bn1);
	    ses.save(bn2);
	    ses.save(bn3);
	    ses.save(e);
	    ses.save(e1);
	    ses.save(e2);
	    ses.save(c);
	    
	    
	  
	   
	   
	//   ses.persist(e1);    
	    tx.commit();    
	        
	    ses.close();    
	    System.out.println("success"); 
		

		
	}

}
