package ManyToManyMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class MultiAuthor {


	@Id
	@Column(name = "AUTHOR_ID")
	 @GeneratedValue(strategy=GenerationType.AUTO)  	
	
	private long id;
	private String name;
	private String email;
	
	@ManyToMany(targetEntity=MultiBooks.class,cascade = CascadeType.ALL)
	private List<MultiBooks> book;
	
	public MultiAuthor() {
		super();
	}


	public MultiAuthor(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	
	
	

	public List<MultiBooks> getBook() {
		return book;
	}


	public void setBook(List<MultiBooks> book) {
		this.book = book;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	

	
}
