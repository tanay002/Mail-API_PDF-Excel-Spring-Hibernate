package OneToManyUsingMap;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="AddMap")

public class Address1 {

	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  	
	private int addId;
	private String city;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String,Employee1> emp;

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

	public Map<String,Employee1> getEmp() {
		return emp;
	}

	public void setEmp(Map<String,Employee1> emp) {
		this.emp = emp;
	}

}
