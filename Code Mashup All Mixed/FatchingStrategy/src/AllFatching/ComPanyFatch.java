package AllFatching;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="CompanyFatch")
public class ComPanyFatch
{
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  	

	@Column(name = "company_id")
    private Long Id;
 
    @Column
    String name;

	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    @Fetch(FetchMode.SELECT)
//	@Fetch(FetchMode.SUBSELECT)
	//@Fetch(FetchMode.JOIN)
	@BatchSize(size=7)
	private List<EmployeeFatch> emp;  

    
	public List<EmployeeFatch> getEmp() {
		return emp;
	}

	public void setEmp(List<EmployeeFatch> emp) {
		this.emp = emp;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComPanyFatch [Id=" + Id + ", name=" + name + ", emp=" + emp + "]";
	}

	
    
    
    
 }
