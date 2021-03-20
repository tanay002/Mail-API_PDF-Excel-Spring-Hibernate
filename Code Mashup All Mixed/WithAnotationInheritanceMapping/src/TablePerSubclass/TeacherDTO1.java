package TablePerSubclass;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Teacher13")
@PrimaryKeyJoinColumn(name="id")

public class TeacherDTO1 extends PersonDTO1 {
	private String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	

}
