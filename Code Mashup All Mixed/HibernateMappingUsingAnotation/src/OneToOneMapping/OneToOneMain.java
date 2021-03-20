package OneToOneMapping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class OneToOneMain {

	public static void main(String[] args) {
	
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("OneToOneSnnotation.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();

		// creates a Book entity
		BookDto newBook = new BookDto();
		newBook.setTitle("Hibernate Made Easy");
		newBook.setDescription("Simplified Data Persistence with Hibernate and JPA");
		newBook.setPublishedDate(new Date());
		
	/*	AuthorDto author=new AuthorDto("Cameron Wallace McKenzie", "Cameron@gmail.com");
		newBook.setAuthor(author);
	*/	
		// persists the book entity

	
		
		Long bookId = (Long) ses.save(newBook);
// gets the book entity back
	
		
		
		
		AuthorDto author=new AuthorDto();
		author.setEmail("Sakshi2941996@gmail.com");
		author.setName("Hindi");
		author.setBook(newBook);
		
		newBook.setAuthor(author);
		
		
		
		BookDto book = (BookDto) ses.get(BookDto.class,bookId);
		System.out.println("Book's Title: " + book.getTitle());
		System.out.println("Book's Description: " + book.getTitle());
		
		
	AuthorDto author1 = book.getAuthor();
		System.out.println("Author's Name: " + author1.getName());
		System.out.println("Author's Email: " + author1.getEmail());
		
		
		ses.persist(newBook);    
		    tx.commit();    
		        
		    ses.close();    
		    System.out.println("success"); 

		
	}

}
