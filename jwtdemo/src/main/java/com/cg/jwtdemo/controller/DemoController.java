/**
 * 
 */
package com.cg.jwtdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DEVANG
 *
 */

@RestController
public class DemoController {

	@GetMapping("/data")
	public ResponseEntity<?> getData(){
		return ResponseEntity.ok("Check Data.");
	}
	
	@GetMapping("/foo")
	public ResponseEntity<?> getFoo(){
		return ResponseEntity.ok("Foo.");
	}
	
}
