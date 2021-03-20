package Pagination;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findStudentByName",  
	        query = "from Student s where s.sname = :name"  
	        )  
	    }  
	) 

@Entity
@Table(name="Std")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int sid;
	private String sname;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname +  "]";
	}
	
	
	
	
}
