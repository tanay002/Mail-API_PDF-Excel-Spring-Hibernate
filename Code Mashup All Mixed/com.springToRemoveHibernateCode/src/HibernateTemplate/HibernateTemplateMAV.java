package HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HibernateTemplateMAV {
				
		@Autowired
		HibernateTemplate t;
				
		@RequestMapping(value = "/doRegister1")
		public String doRegisteration(@ModelAttribute("Message")User u)throws NumberFormatException
		{
	 /*   
	 	   
		cfg.configure("HibernateConfiguration.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();                          //remove using HibernateTemplate
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
	*/	

	/*//int s4=Integer.parseInt(req.getParameter("uid"));
	String s1=req.getParameter("uname");
	String s2=req.getParameter("email");
	String s3=req.getParameter("password");                         //remove using model attribute
	//reg.setUid(s4);
	u.setEmail(s2);
	u.setPass(s3);
	u.setUname(s1);
*/
		t.save(u);
		System.out.println("Done");
	    
			return "login";	
	}
	}

	
	
	


