/**
 * 
 */
package com.cg.DemoSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DEVANG
 *
 */

@Controller
public class DemoController {

	@GetMapping("/admin")
	public String myAdmin() {
		return "AdminPage";
	}
	
	@GetMapping("/user")
	public String myUser() {
		return "HomePage";
	}
}
