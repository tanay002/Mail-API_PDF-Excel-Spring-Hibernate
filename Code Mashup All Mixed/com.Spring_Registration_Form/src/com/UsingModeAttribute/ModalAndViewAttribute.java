package com.UsingModeAttribute;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Spring_Registration_Form.Controller.RegForm;

@Controller
public class ModalAndViewAttribute {
	
	@RequestMapping("/doreg")
	public String doRegistration(@ModelAttribute("Message")RegForm reg, AnnotationConfiguration cfg)
	{
		
		   
		cfg.configure("HibernateConfiguration.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		

	/*//int s4=Integer.parseInt(req.getParameter("uid"));
	String s1=req.getParameter("uname");
	String s2=req.getParameter("email");                                   //S0pring k ModelAttribute  Anotation se set and get Servlet ka kaam finish ho jata h
	String s3=req.getParameter("password");
	//reg.setUid(s4);
	reg.setEmail(s2);
	reg.setPass(s3);
	reg.setUname(s1);
*/
		
/*if(ses.save(reg)!=null)
{
*/	
/*}
else
{
System.out.println("error page =Something wrong");	
}
*/
ses.save(reg);
tx.commit();
		ses.close();
		System.out.println("Done");
		return "login";	
	
	}
}