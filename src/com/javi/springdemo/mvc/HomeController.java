package com.javi.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//This says: This is an mvc controller 
public class HomeController {
	
	@RequestMapping("/")//add request mapping to controller method
	public String showPage() {
		return "main-menu";
	}

}
