package CacheDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Shop {

	public static void main(String[] args) {


		
		Product p=new Product();
		p.setProductId(10);
		p.setProName("Dvd");
		p.setPrice(7000);
		
		p.setProductId(11);
		p.setProName("Presh");
		p.setPrice(2000);
		
		p.setProductId(12);
		p.setProName("AC");
		p.setPrice(9000);
		

		
		
		Configuration cfg=new Configuration();
		cfg.configure("Shop.cfg.xml"); 

		SessionFactory sf = cfg.buildSessionFactory();
		Session ses1 = sf.openSession();
		Transaction tx=ses1.beginTransaction();

Product s=(Product)ses1.get(Product.class,1);

		System.out.println("Loaded object product name"+s.getProName()+"Product_Id"+s.getProductId()+"Product_price "+s.getPrice());
System.out.println("Object1 Loaded successfully.....!!");
		ses1.save(p);
tx.commit();		
		ses1.close();

		try{
			Thread.sleep(6000);
		}
		catch (Exception e) {
		}		


		Session ses2 = sf.openSession();
		Transaction tx1=ses2.beginTransaction();

		Product s2=(Product)ses2.get(Product.class,2);
		System.out.println("Loaded object product name"+s2.getProName()+"Product_Id"+s2.getProductId()+"Product_price "+s2.getPrice());
				System.out.println("Object2 Loaded successfully.....!!");
				ses2.save(p);
		tx1.commit();
				ses2.close();

		
		
	}
		

	}


