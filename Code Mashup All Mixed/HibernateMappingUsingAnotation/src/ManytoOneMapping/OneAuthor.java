package ManytoOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OneAuthor {

	@Id
	@Column(name = "AUTHOR_ID")
	 @GeneratedValue(strategy=GenerationType.AUTO)  	
	
	private long id;
	private String name;
	private String email;
	
/*	@OneToOne(targetEntity=MultipleBooks.class,cascade = CascadeType.ALL)
	private MultipleBooks book;
*/	
	public OneAuthor() {
		super();
	}


	public OneAuthor(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	
	
/*
public MultipleBooks getBook() {
		return book;
	}


	public void setBook(MultipleBooks book) {
		this.book = book;
	}

*/
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
