package TablePerConcreteClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Student11")
@AttributeOverrides({ 
	@AttributeOverride(name="pid",column=@Column(name="pid")),
@AttributeOverride(name="pname",column=@Column(name="pname"))})

public class StudentDTO extends  PersonDTO {
	private int rollno;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	

}
