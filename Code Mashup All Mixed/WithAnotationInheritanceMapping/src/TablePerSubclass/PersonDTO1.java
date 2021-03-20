package TablePerSubclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Person13")
@Inheritance(strategy=InheritanceType.JOINED)

public class PersonDTO1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

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
