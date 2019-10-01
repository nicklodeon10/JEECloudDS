package com.cg.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.SpringBootDemo.dto.Product;
import com.cg.SpringBootDemo.service.ProductService;

@RestController
@RequestMapping(value="/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/demogetall")
	public String demoGet(@RequestParam("ename")String myname) {
		System.out.println(myname);
		return "Get All Data";
	}

	@PostMapping("/demoadd")
	public String demoAdd(@ModelAttribute Product product) {
		System.out.println(product);
		return "Add";
	}
	
	@PostMapping("/demoadd1")
	public String demoAdd1(@RequestBody Product product) {
		System.out.println(product);
		return "Add1";
	}
	
	@PostMapping("/add")
	public String addProduct(@RequestBody Product product) {
		productService.addProduct(product);
		return "Added";
	}
	
	@GetMapping("/getAll")
	public List<Product> getAllProducts(){
		return productService.showAll();
	}
	
	@DeleteMapping("/delete")
	public boolean removeProduct(@RequestParam("prodId")Integer productId) {
		return productService.removeProduct(productId);
	}
	
	@PutMapping("/update")
	public boolean updateProduct(@ModelAttribute Product product) {
		return productService.updateProduct(product);
	}
}
