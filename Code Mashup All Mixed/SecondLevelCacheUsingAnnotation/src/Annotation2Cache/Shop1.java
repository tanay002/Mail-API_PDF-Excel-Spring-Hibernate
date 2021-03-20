package Annotation2Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Shop1 {

	public static void main(String[] args) {
		
		
		Product1 p=new Product1();
		p.setProductId(7);
		p.setProName("Press");
		p.setPrice(20000);
		
		p.setProductId(8);
		p.setProName("Cooler");
		p.setPrice(13000);
		
		p.setProductId(9);
		p.setProName("Fan");
		p.setPrice(6000);
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("Shop1.cfg.xml"); 

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses1 = sf.openSession();
		Transaction tx=ses1.beginTransaction();

Product1 s=(Product1)ses1.get(Product1.class,1);

		System.out.println("Loaded object product name"+s.getProName()+"Product_Id"+s.getProductId()+"Product_price "+s.getPrice());
System.out.println("Object1 Loaded successfully.....!!");
		ses1.save(p);
tx.commit();		
		ses1.close();

		try{
			Thread.sleep(600);
		}
		catch (Exception e) {
		}		


		Session ses2 = sf.openSession();
		Transaction tx1=ses2.beginTransaction();

		Product1 s2=(Product1)ses2.get(Product1.class,2);
		System.out.println("Loaded object product name"+s2.getProName()+"Product_Id"+s2.getProductId()+"Product_price "+s2.getPrice());
				System.out.println("Object2 Loaded successfully.....!!");
			ses2.save(p);
		tx1.commit();
				ses2.close();

		

	}

}
