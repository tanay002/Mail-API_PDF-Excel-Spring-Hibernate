package OneToManyUsingMap;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="empMap")

public class Employee1 {

	  @Id  
	     @GeneratedValue(strategy=GenerationType.AUTO)    

	private int empid;
	private String eName;
	
	
	@ManyToOne(cascade=CascadeType.ALL)  
	private Address1 address;


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public Address1 getAddress() {
		return address;
	}


	public void setAddress(Address1 address) {
		this.address = address;
	}

	
	
}
