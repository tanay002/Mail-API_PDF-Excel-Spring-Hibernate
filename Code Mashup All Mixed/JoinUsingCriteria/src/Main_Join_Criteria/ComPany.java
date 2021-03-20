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

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="")
public class ComPany {

	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  	
	   @Column(name = "company_id")
    private Long Id;
 
    @Column
    String name;
 
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "company")
    private Set<Benifit> benefits = new HashSet<Benifit>();

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

	public Set<Benifit> getBenefits() {
		return benefits;
	}

	public void setBenefits(Set<Benifit> benefits) {
		this.benefits = benefits;
	}

	@Override
	public String toString() {
		return "ComPany [Id=" + Id + ", name=" + name + ", benefits=" + benefits + "]";
	}
 
    
    
    
 }
