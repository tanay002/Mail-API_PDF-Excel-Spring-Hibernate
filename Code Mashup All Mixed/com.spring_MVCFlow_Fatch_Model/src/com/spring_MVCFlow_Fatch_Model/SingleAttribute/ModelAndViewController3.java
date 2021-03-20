package com.spring_MVCFlow_Fatch_Model.SingleAttribute;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAndViewController3 {

	
@Autowired
private User1 u1;
	@RequestMapping("/mav3")
	public ModelAndView displayUserDetails()
	{
		u1.setUid(1);
		u1.setUname("Sakshi");
		List<User1> list=new ArrayList<User1>();

    list.add(u1);
    
		ModelAndView m=new ModelAndView("SingleAttripute","Message",list);
		return m;
    
	}
}
