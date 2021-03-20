package HttpSessionUseMVCController;


import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Spring_Registration_Form.Controller.RegForm;
@Controller
public class ModalAndViewSession {

	
	@RequestMapping("/go")
	public String doRegistration(@ModelAttribute("Message")RegForm reg, AnnotationConfiguration cfg,HttpSession hts)
	{
		
		cfg.configure("HibernateConfiguration.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();

		Transaction tx=ses.beginTransaction();
		System.out.println("controller");
		/*//int s4=Integer.parseInt(req.getParameter("uid"));
		String s1=req.getParameter("uname");
		String s2=req.getParameter("email");                                   //Spring k ModelAttribute  Anotation se set and get Servlet ka kaam finish ho jata h
		String s3=req.getParameter("pass");
		//reg.setUid(s4);

		reg.setUname(s1);
		reg.setPass(s3);
		reg.setEmail(s2);

*/
		hts.setAttribute("register",reg );
		ses.save(reg);
		tx.commit();
		ses.close();
		System.out.println("Done");

		return "login";	
	}








}
