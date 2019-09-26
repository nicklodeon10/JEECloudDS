package com.cg.springmvcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcdemo.dto.Product;
import com.cg.springmvcdemo.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService prodService;
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value="/addPage", method = RequestMethod.GET)
	public String addProductPage(@ModelAttribute("product") Product pro) {
		return "AddProduct";
	}
	
	@RequestMapping(value="/pagesubmit", method=RequestMethod.POST)
	public String addData(@ModelAttribute("product") Product pro) {
		prodService.addProduct(pro);
		return "home";
	}
	
	@RequestMapping(value="/showAll", method=RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Product> prodList=prodService.showProduct();
		return new ModelAndView("ShowProduct", "productData", prodList);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deletePage() {
		return "DeleteProduct";
	}
	
	@RequestMapping(value="/deleteData", method=RequestMethod.POST)
	public String deleteData(@RequestParam("pid")Integer prodId) {
		prodService.removeProduct(prodId);
		return "redirect:/showAll";
	}
}
