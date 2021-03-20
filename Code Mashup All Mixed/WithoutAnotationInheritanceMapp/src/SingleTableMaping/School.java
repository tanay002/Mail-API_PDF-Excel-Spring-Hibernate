package SingleTableMaping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class School {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("SchoolC.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		
		Persondto p=new Persondto();
		p.setpId(101);
		p.setpName("Chiku");
		
		TeacherDto t=new TeacherDto();
		t.setCourse("Java");
		t.setpId(103);
		t.setpName("Piku");
		
		StudentDto std=new StudentDto();
		std.setpId(102);
		std.setpName("Tiku");
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
