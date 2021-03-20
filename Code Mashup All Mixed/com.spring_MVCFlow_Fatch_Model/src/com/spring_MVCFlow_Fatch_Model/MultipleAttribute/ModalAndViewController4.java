package com.spring_MVCFlow_Fatch_Model.MultipleAttribute;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class ModalAndViewController4 {
	
	
	@Autowired
	private User2 u;
	
	
	@Autowired
	private User2 u1;
	
	@Autowired
	private User2 u2;
	
		@RequestMapping("/mav4")
		public String displayUserDetails( ModelMap m)
		{
			u.setUid(1);
			u.setUname("Sakshi");
			
			u1.setUid(2);
			u1.setUname("Neha");
			
			u2.setUid(3);
			u2.setUname("Priya");
				 
			List<User2> list=new ArrayList<User2>();
	    list.add(u);
			
	    List<User2> list2=new ArrayList<User2>();
	    list2.add(u1);
			
	    List<User2> list3=new ArrayList<User2>();
	    list3.add(u2);
			
	    m.addAttribute("Message", list);
	    m.addAttribute("Message1", list2);
	    m.addAttribute("Message2", list3);
	    
	    
		//	ModelAndView m=new ModelAndView("SingleAttripute","Message",list);
			return "SingleAttripute";
		}


}
