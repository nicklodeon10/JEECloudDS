package com.cg.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/add")
	public String addProduct(@ModelAttribute Product product) {
		System.out.println("Adding Product "+product);
		productService.addProduct(product);
		return "Added";
	}
	
	@GetMapping("/getAll")
	public List<Product> getAllProducts(){
		System.out.println("Getting All Products.");
		return productService.showAll();
	}
	
	@DeleteMapping("/delete")
	public boolean removeProduct(@RequestParam("prodId")Integer productId) {
		System.out.println("Removing a Product.");
		return productService.removeProduct(productId);
	}
	
	@PutMapping("/update")
	public boolean updateProduct(@RequestBody Product product) {
		System.out.println("Updating product."+product);
		return productService.updateProduct(product);
	}
	
	@GetMapping("/search")
	public Product searchProduct(@RequestParam("prodId")Integer productId) {
		System.out.println("Searching Product. "+productId);
		return productService.search(productId);
	}
}
