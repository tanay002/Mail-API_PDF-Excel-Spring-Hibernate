package OneToManyWithOutAnnotation;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class Address2 {
  	
	private int addId;
	private String city;
	
	private Map<String,Employee2> emp;

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

	public Map<String,Employee2> getEmp() {
		return emp;
	}

	public void setEmp(Map<String,Employee2> emp) {
		this.emp = emp;
	}

}
