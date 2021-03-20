package OneToManyMapping_For_join_Criteria;

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
@Table(name="JoinCriteriaCompany")
public class ComPany1 {

	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  	
	   @Column(name = "company_id")
    private Long Id;
 
    @Column
    String name;
 
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "company")
    private Set<Benifit1> benefits = new HashSet<Benifit1>();

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

	public Set<Benifit1> getBenefits() {
		return benefits;
	}

	public void setBenefits(Set<Benifit1> benefits) {
		this.benefits = benefits;
	}

	@Override
	public String toString() {
		return "ComPany [Id=" + Id + ", name=" + name + ", benefits=" + benefits + "]";
	}
 
    
    
    
 }
