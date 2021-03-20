package AllFatching;

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
@Table(name="EmployeeFatch")

public class EmployeeFatch 
{

	  @Id  
	     @GeneratedValue(strategy=GenerationType.AUTO)    

	    @Column(name = "employee_id")
	    private Long id;
	 
	    @Column(name = "first_name")
	    private String firstName;
	 
	    @Column(name = "last_name")
	    private String lastName;
	 
	  
	  
	   
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

		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", company=" 
					+ "]";
		}

	
	    
	    
}
