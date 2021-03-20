package Main_Join_Criteria;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="emp")

public class Employee {

	  @Id  
	     @GeneratedValue(strategy=GenerationType.AUTO)    

	    @Column(name = "employee_id")
	    private Long id;
	 
	    @Column(name = "first_name")
	    private String firstName;
	 
	    @Column(name = "last_name")
	    private String lastName;
	 
	    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	    @JoinColumn(name = "company_id",referencedColumnName = "company_id")
	    private ComPany company;

	    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "company")
	    private Set<Benifit> benefits = new HashSet<Benifit>();

	    
		public Set<Benifit> getBenefits() {
			return benefits;
		}

		public void setBenefits(Set<Benifit> benefits) {
			this.benefits = benefits;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public ComPany getCompany() {
			return company;
		}

		public void setCompany(ComPany company) {
			this.company = company;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", company=" + company
					+ ", benefits=" + benefits + "]";
		}

	
	    
	    
}
