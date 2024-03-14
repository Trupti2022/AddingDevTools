package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		int a=67;
		int b= 20;
		int c=90;
		
		return "This is just testing!!!!/t sum of a , b and c is" +(a+b+c);
	}	

}
