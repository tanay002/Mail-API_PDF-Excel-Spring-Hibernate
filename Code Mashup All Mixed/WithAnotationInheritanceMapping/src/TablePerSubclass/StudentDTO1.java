package TablePerSubclass;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Student13")
@PrimaryKeyJoinColumn(name="id")

public class StudentDTO1 extends PersonDTO1{
private int rollno;

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

}
