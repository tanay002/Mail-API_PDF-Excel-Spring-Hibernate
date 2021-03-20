package Conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import MVCFlow_Layer_Service.UserDto;
import ServiceS.MyService;

@Controller
public class ModelAndViewController {

	@Autowired
	MyService m;
			
	@RequestMapping(value = "/Register",method=RequestMethod.POST)
	public String doRegisteration(@ModelAttribute("Message")UserDto u,ModelMap m1)throws Exception
	{
	boolean b=m.doUserReg(u);
	//System.out.println("Done");
    if(b == true)
		{
    	return "RegisteredPage";	
		}
    else
    {
    	return "ErrorPage";
    }
}
/*
	@RequestMapping(value = "/Login.do",method=RequestMethod.POST)
	public String doLoginPage(@ModelAttribute("logindata")UserDto u,ModelMap m1)throws Exception
	{
u=m.doUserLogin(u);
	//System.out.println("Done");
    if(u!= null)
		{
    	m1.addAttribute("info",u);
    	return "profile";	
		}
    else
    {
    	m1.addAttribute("msg","Something went wrong....please reenter valid data");
    	return "ErrorPage";
    }
}	
	
	
	@RequestMapping(value = "/Delete.do",method=RequestMethod.POST)
	public String doDeletePage(@ModelAttribute("deletedata")UserDto u,ModelMap m1)throws Exception
	{
	boolean b=m.doDelete(u);
	//System.out.println("Done");
    if(b==true)
		{
    	m1.addAttribute("msg","deleted Successfully");
    	return "deletePage";	
		}
    else
    {
    	m1.addAttribute("msg","Something went wrong....Could not deleted");
    	return "ErrorPage";
    }
*/
}
