package com.Spring_MVCFlow.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/loginpage") 
	public String loadLoginPage()
	{
		return "hello";
	}

}
