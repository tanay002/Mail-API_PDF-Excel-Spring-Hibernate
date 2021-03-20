package ManyToManyMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ManyToManyMain {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("ManyToMany.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();

		// creates a Book entity
		MultiBooks newBook1 = new MultiBooks();
		newBook1.setTitle("Hibernate Made Easy");
		newBook1.setDescription("Simplified Data Persistence with Hibernate ");
		newBook1.setPublishedDate(new Date());
		//newBook1.setAuthor
		
		// creates a Book entity
		MultiBooks newBook2 = new MultiBooks();
		newBook2.setTitle("Spring Made Easy");
		newBook2.setDescription("Simplified Data Persistence with Spring");
		newBook2.setPublishedDate(new Date());
	
		List list=new ArrayList();
		list.add(newBook1);
		list.add(newBook2);
		
		MultiAuthor author1=new MultiAuthor();
		author1.setEmail("Sakshi2941996@gmail.com");
		author1.setName("Sakshi");
		author1.setBook(list);
		
		
		
		
		// creates a Book entity
		MultiBooks newBook3 = new MultiBooks();
		newBook3.setTitle("servlet Made Easy");
		newBook3.setDescription("Simplified Data Persistence with Servlet");
		newBook3.setPublishedDate(new Date());
	
		
		
		// creates a Book entity
				MultiBooks newBook4 = new MultiBooks();
				newBook4.setTitle("jsp Made Easy");
				newBook4.setDescription("Simplified Data Persistence with jsp");
				newBook4.setPublishedDate(new Date());
				
				List list1=new ArrayList();
				list1.add(newBook3);
				list1.add(newBook4);
				
		
	
	
	MultiAuthor author2=new MultiAuthor();
	author2.setEmail("Swatiwadurkar@gmail.com");
	author2.setName("Swati");
	author2.setBook(list1);
	
	
	List authorlist=new ArrayList();
	authorlist.add(author2);
	authorlist.add(author1);	
	
	newBook1.setAuthor(authorlist);

	ses.persist(newBook1);
	ses.persist(author1);
	ses.persist(author2);
	
	
	    tx.commit();    
	        
	    ses.close();    
	    System.out.println("success"); 

	
	
	
	}

}
