package com.spring_MVCFlow_Fatch_Model.normal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ModelAndViewController {
	
	
	@RequestMapping("/mav")
	public ModelAndView displayUserDetails()
	{
		
		ModelAndView m=new ModelAndView("hello1","Message","rits");
		return m;
		
	}

}
