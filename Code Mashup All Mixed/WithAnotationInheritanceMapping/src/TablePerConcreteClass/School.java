package TablePerConcreteClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Anotation.PersonDto;
import Anotation.StudentDto;
import Anotation.TeacherDto;

public class School {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("WithAnotation.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		
		PersonDTO p=new PersonDTO();
		//p.setPid(101);
		p.setPname("Chiku");
		
		TeacherDTO t=new TeacherDTO();
		t.setCourse("Java");
	//	t.setPid(103);
		t.setPname("Piku");
		
		StudentDTO std=new StudentDTO();
	//	std.setPid(102);
		std.setPname("Tiku");
		std.setRollno(203);
		Transaction tx=ses.beginTransaction();
		ses.save(p);
		ses.save(std);
		ses.save(t);
		tx.commit();
		ses.close();
		System.out.println("Done");
	

	}

}
