package TablePerSubclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import TablePerConcreteClass.PersonDTO;
import TablePerConcreteClass.StudentDTO;
import TablePerConcreteClass.TeacherDTO;

public class Coching {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("WithAnotation.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		
		PersonDTO1 p=new PersonDTO1();
		//p.setPid(101);
		p.setPname("Chiku");
		
		TeacherDTO1 t=new TeacherDTO1();
		t.setCourse("Java");
	//	t.setPid(103);
		t.setPname("Piku");
		
		StudentDTO1 std=new StudentDTO1();
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
