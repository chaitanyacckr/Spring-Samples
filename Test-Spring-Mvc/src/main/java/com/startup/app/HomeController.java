package com.startup.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getDisplayName() {
		return "home";
	}
	
	@RequestMapping(value = "/testJson", method = RequestMethod.GET)
	@ResponseBody
	 public  String getJsonResponse() {
		return "hello this is json";
	}
	
	

}
