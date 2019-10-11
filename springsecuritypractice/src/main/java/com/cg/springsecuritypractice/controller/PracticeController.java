/**
 * 
 */
package com.cg.springsecuritypractice.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DEVANG
 *
 */

@Controller
public class PracticeController {

	@GetMapping("/")
	public String homePage() {
		return "Home";
	}
	
	@GetMapping("/admin")
	public String adminPage(Authentication authentication) {
		System.out.println(authentication.getName());
		return "AdminPage";
	}
	
	@GetMapping("/user")
	public String userPage() {
		return "UserPage";
	}
}
