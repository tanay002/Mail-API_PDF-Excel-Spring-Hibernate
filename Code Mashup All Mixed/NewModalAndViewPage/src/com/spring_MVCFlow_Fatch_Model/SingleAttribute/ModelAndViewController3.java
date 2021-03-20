package com.spring_MVCFlow_Fatch_Model.SingleAttribute;
import java.util.List;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import StudentDetail.LoginDto;
import StudentDetail.StudentRegistrationDto;

@Controller
public class ModelAndViewController3 {

// StudentRegistrationDto s1;
	


@RequestMapping("/home")
public String homeDetails()
{
	return "Home";
}

@RequestMapping("/reg")
public String regpage()
{
	return "StudentRegistration";
}

@RequestMapping("/loginpage")
public String loginpage()
{
	return "login";
}

@RequestMapping("/doreg")
public ModelAndView registerUserDetails(@ModelAttribute StudentRegistrationDto s1,AnnotationConfiguration cfg)
{
	cfg.configure("HibernateConfiguration.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
ses.save(s1);
tx.commit();
System.out.println("Done");
	if(s1!=null)
{
	ModelAndView m=new ModelAndView("login","Message",s1);
	System.out.println("Success");
	return m;
}
else{
	ModelAndView m=new ModelAndView("StudentRegistration","InvalidMsg","invalid Code");
	System.out.println("Failed");
return m;
}
}


@RequestMapping("/login")
public ModelAndView loginUser(AnnotationConfiguration cfg,@ModelAttribute  StudentRegistrationDto s1,HttpSession hs)
{
System.out.println("Done");
String checkemail=s1.getEmail();
String checkPassword=s1.getPassword();
cfg.configure("HibernateConfiguration.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session ses=sf.openSession();
Transaction tx=ses.beginTransaction();
//ses.save();
StudentRegistrationDto sdata=(StudentRegistrationDto) ses.get(StudentRegistrationDto.class,checkemail );
if(sdata!=null)
{
	if(sdata.getPassword().equals(checkPassword))
	{	
		hs.setAttribute("stDetail",sdata );
		ModelAndView m=new ModelAndView("userWelcome","Message",sdata);
	System.out.println("Success");
	return m;
	}
else
{
	System.out.println("Failed");
	ModelAndView m1=new ModelAndView("login","Message","invalid Code");
	
return m1;
}
}
else{
	System.out.println("Failed2");
ModelAndView m1=new ModelAndView("login","Message","invalid Code");
return m1;
}
}

	@RequestMapping("/read")
	public ModelAndView displayUserDetails(@ModelAttribute StudentRegistrationDto s1,AnnotationConfiguration cfg)
	{
		cfg.configure("HibernateConfiguration.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
     Criteria c=ses.createCriteria(StudentRegistrationDto.class);
    List<StudentRegistrationDto> al=c.list();
/*Query q=ses.createQuery(" from StudentRegistrationDto ");
List list=q.list();
		list.add(s1);*/
    ModelAndView mv=new ModelAndView("ReadStudentList","read",al);
	    return mv;    
	}
	

@RequestMapping("/editDetail")
public ModelAndView editStudentDetail( StudentRegistrationDto s1,HttpSession hs)
{
	StudentRegistrationDto std=(StudentRegistrationDto)hs.getAttribute("stDetail");
	ModelAndView m1=new ModelAndView("updateForm","Message",std);
	System.out.println("Failed");
	return m1;

}
	
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateUserDetails(@ModelAttribute("update") StudentRegistrationDto s1,AnnotationConfiguration cfg,HttpSession hs)
	{
		cfg.configure("HibernateConfiguration.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
        hs.getAttribute("stDetail");
		ses.update(s1);
		tx.commit();
		return "UpdateDataSuccessfully";    
	}


@RequestMapping("/changePassword")
public String changePassword()
{
	return "changePassword";
}

@RequestMapping("/changePasswordSuccess")
public String changePasswordSuccess()
{
	
	return "SuccessChangePassword";
}


@RequestMapping("/deletepage")
public ModelAndView deleteStudentDetail( StudentRegistrationDto s1,HttpSession hs)
{
	StudentRegistrationDto std=(StudentRegistrationDto)hs.getAttribute("stDetail");
	ModelAndView m1=new ModelAndView("deleteData","Message",std);
	System.out.println("Failed");
	return m1;
}


@RequestMapping("/delete")
public String deleteDetails(@ModelAttribute("delete") StudentRegistrationDto s1,AnnotationConfiguration cfg,HttpSession hs)
{
	cfg.configure("HibernateConfiguration.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
 hs.getAttribute("stDetail");

 ses.delete(s1);
	tx.commit();
	return "deleteSuccessfully";    
}


@RequestMapping("/deleteMultidata")
public ModelAndView deleteMultiStudent( StudentRegistrationDto s1,HttpSession hs,AnnotationConfiguration cfg)
{
	cfg.configure("HibernateConfiguration.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
 Criteria c=ses.createCriteria(StudentRegistrationDto.class);
List<StudentRegistrationDto> al=c.list();
	ModelAndView m1=new ModelAndView("deleteMultipleData","deleteMultipleData",al);
	return m1;
}


@RequestMapping("/deleteMultiple")
public String deleteMultipleData(@ModelAttribute StudentRegistrationDto s1,AnnotationConfiguration cfg,HttpSession hs)
{
	cfg.configure("HibernateConfiguration.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();

	StudentRegistrationDto sr=(StudentRegistrationDto)hs.getAttribute("stDetail");
String email=sr.getEmail();
 ses.delete(email);
	tx.commit();
	return "redirect:read.do";    
}



@RequestMapping("/logout")
public String logout(HttpSession hs)
{
	hs.invalidate();

	return "Home";
}
}