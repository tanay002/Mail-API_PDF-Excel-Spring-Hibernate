package OneToManyMapping_For_join_Criteria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="JoinCriteriaBenifit")
public class Benifit1 {
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)    

	    @Column(name = "benefit_id")
	    private Long id;
	 
	    @Column(name = "name")
	    private String name;
	 
	    @ManyToOne
	    @JoinColumn(name = "company_id")
	    private ComPany1 company;

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

		public ComPany1 getCompany() {
			return company;
		}

		public void setCompany(ComPany1 company) {
			this.company = company;
		}

		@Override
		public String toString() {
			return "Benifit [id=" + id + ", name=" + name + ", company=" + company + "]";
		}
	 
	 

}
