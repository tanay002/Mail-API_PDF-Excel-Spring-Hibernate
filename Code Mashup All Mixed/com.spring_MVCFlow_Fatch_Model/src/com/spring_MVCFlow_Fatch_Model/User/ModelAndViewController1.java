package com.spring_MVCFlow_Fatch_Model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ModelAndViewController1 {
@Autowired 
private User user;

	@RequestMapping("/mav1")
	public ModelAndView displayUserDetails()
	{
	user.setUid(101);	
	user.setUname("Sakshi");
		ModelAndView m1=new ModelAndView("hello1","Message",user);
		return m1;
	}	
	
}
