package TablePerConcreteClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Teacher11")
@AttributeOverrides({ 
	@AttributeOverride(name="pid",column=@Column(name="pid")),
@AttributeOverride(name="pname",column=@Column(name="pname"))})


public class TeacherDTO extends  PersonDTO{
	private String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	

}
