package com.cg.springcoredemo.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcoredemo.dto.Product;
import com.cg.springcoredemo.service.ProductService;

public class MainApplication {
	
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		ProductService productService=(ProductService) app.getBean("productService");
		
		Product pro = (Product) app.getBean("prod");
		pro.setProdId(1001);
		pro.setProdName("Mobile");
		
		productService.addProduct(pro);
		System.out.println(productService.showProduct());
	}

}
