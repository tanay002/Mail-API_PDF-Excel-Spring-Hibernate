package Anotation;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="teach")

public class TeacherDto extends PersonDto
{
private String course;

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}


}
