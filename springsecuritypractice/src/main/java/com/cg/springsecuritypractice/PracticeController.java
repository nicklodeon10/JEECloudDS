/**
 * 
 */
package com.cg.springsecuritypractice;

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
	public String adminPage() {
		return "AdminPage";
	}
	
	@GetMapping("/user")
	public String userPage() {
		return "UserPage";
	}
}
