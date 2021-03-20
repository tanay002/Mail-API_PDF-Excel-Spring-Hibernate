package ManyToManyMapping;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MultiBooks {

	@Id
	@Column(name = "BOOK_ID")
	 @GeneratedValue(strategy=GenerationType.AUTO)  	
	private long id;
	private String title;
	private String description;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "PUBLISHED")
	private Date publishedDate;
	
	@ManyToMany(targetEntity=MultiAuthor.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "AUTHOR_ID")
	private List<MultiAuthor> author;

	public MultiBooks () {
		super();
	}

	public MultiBooks (long id, String title, String description, Date publishedDate, List<MultiAuthor> author) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.publishedDate = publishedDate;
		this.author = author;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public List<MultiAuthor> getAuthor() {
		return author;
	}

	public void setAuthor(List<MultiAuthor> author2) {
		this.author = author2;
	}
	



	
}
