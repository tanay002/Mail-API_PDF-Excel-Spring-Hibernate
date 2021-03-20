package com.Spring_Registration_Form.Controller;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModalAndViewController {
	
	@Autowired
	private RegForm reg;
	
	@RequestMapping(value = "/doRegister")
	public String doRegisteration(HttpServletRequest req, AnnotationConfiguration cfg)throws NumberFormatException
	{
		System.out.println("Hello");
	cfg.configure("HibernateConfiguration.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();

//int s4=Integer.parseInt(req.getParameter("uid"));
String s1=req.getParameter("uname");
String s2=req.getParameter("email");
String s3=req.getParameter("password");
//reg.setUid(s4);
reg.setEmail(s2);
reg.setPass(s3);
reg.setUname(s1);

/*
List<RegForm> list=new ArrayList<RegForm>();

list.add(reg);
	
m.addAttribute("Message", list);                                 
m.addAttribute("Message1", list);                                //For Adding Attribute
m.addAttribute("Message2", list);
*/		
	ses.save(reg);
	tx.commit();
	ses.close();
	System.out.println("Done");
		return "login";	
}
}
