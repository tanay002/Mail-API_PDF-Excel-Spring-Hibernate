package Main_Join_Criteria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Benifit {
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)    

	    @Column(name = "benefit_id")
	    private Long id;
	 
	    @Column(name = "name")
	    private String name;
	 
	    @ManyToOne
	    @JoinColumn(name = "company_id")
	    private ComPany company;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ComPany getCompany() {
			return company;
		}

		public void setCompany(ComPany company) {
			this.company = company;
		}

		@Override
		public String toString() {
			return "Benifit [id=" + id + ", name=" + name + ", company=" + company + "]";
		}
	 
	 

}
