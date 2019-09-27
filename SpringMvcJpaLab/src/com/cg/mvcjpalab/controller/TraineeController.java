package com.cg.mvcjpalab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TraineeController {

	@RequestMapping(value="/adminHome", method=RequestMethod.GET)
	public String adminHome(@RequestParam("adminUsername")String username, @RequestParam("adminPassword")String password) {
		if(username.equals("root") && password.equals("1234")) {
			return "adminHome";
		}else {
			return "invalidLogin";
		}
	}
	
}
