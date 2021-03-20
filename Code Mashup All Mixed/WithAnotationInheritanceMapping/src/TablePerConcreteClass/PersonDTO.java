package TablePerConcreteClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Person12")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class PersonDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)

private int pid;
private String pname;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}

}
