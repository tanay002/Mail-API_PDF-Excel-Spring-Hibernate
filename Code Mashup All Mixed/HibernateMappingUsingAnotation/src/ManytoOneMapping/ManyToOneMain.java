package ManytoOneMapping;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class ManyToOneMain {

	public static void main(String[] args) {
		

		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("ManyToOne.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();

		// creates a Book entity
		MultipleBooks newBook1 = new MultipleBooks();
		newBook1.setTitle("Hibernate Made Easy");
		newBook1.setDescription("Simplified Data Persistence with Hibernate ");
		newBook1.setPublishedDate(new Date());
		
		// creates a Book entity
		MultipleBooks newBook2 = new MultipleBooks();
		newBook2.setTitle("Spring Made Easy");
		newBook2.setDescription("Simplified Data Persistence with Spring");
		newBook2.setPublishedDate(new Date());
	
		// creates a Book entity
		MultipleBooks newBook3 = new MultipleBooks();
		newBook3.setTitle("servlet Made Easy");
		newBook3.setDescription("Simplified Data Persistence with Servlet");
		newBook3.setPublishedDate(new Date());
		
				OneAuthor author=new OneAuthor();
		author.setEmail("Sakshi2941996@gmail.com");
		author.setName("Sakshi");
	
		newBook1.setAuthor(author);
		newBook2.setAuthor(author);
		newBook3.setAuthor(author);
		
		/*Long bookId = (Long) ses.save(newBook1);

		
		MultipleBooks book = (MultipleBooks) ses.get(MultipleBooks.class,bookId);
		System.out.println("Book's Title: " + book.getTitle());
		System.out.println("Book's Description: " + book.getTitle());
	
	
		
	OneAuthor author1 = book.getAuthor();
		System.out.println("Author's Name: " + author1.getName());
		System.out.println("Author's Email: " + author1.getEmail());
*/		
		
		ses.persist(newBook1);
		ses.persist(newBook2);
		ses.persist(newBook3);
		
		
		    tx.commit();    
		        
		    ses.close();    
		    System.out.println("success"); 

		
	}


		
	}


