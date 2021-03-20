package Anotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Collage {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("WithAnotation.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		
		PersonDto p=new PersonDto();
		p.setPid(101);
		p.setPname("Chiku");
		
		TeacherDto t=new TeacherDto();
		t.setCourse("Java");
		t.setPid(103);
		t.setPname("Piku");
		
		StudentDto std=new StudentDto();
		std.setPid(102);
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
