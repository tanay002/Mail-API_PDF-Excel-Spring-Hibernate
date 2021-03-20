package OneToManyMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class EmployeeFatch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name="emp_id")
	private int empid;
	private String eName;
@ManyToOne
@JoinColumn(name="Address_Id")
	 private List<AddressFatch> address;

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

	 @ManyToOne
	 @JoinColumn(name="emp_id")
	 public List<AddressFatch> getAddress() 
	 { return address; }
	  
	  
	  public void setAddress(List<AddressFatch> address) { this.address = address; }
	 }
