package OneToManyUsingSet;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="AddSet")

public class Address {

	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  	
	private int addId;
	private String city;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Employee> emp;

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}

}
