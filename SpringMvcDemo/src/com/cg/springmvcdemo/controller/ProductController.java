package com.cg.springmvcdemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}

	@RequestMapping(value = "/addPage", method = RequestMethod.GET)
	public String addProductPage(@ModelAttribute("product") Product pro, Map<String, Object> model) {
		List<String> types = new ArrayList<String>();
		types.add("SELECT");
		types.add("Electronics");
		types.add("Grocery");
		types.add("Home Appliance");
		types.add("Stationery");
		model.put("dataitem", types);
		return "AddProduct";
	}

	@RequestMapping(value = "/pagesubmit", method = RequestMethod.POST)
	public String addData(@Valid @ModelAttribute("product") Product pro, BindingResult result,  Map<String, Object> model) {
		if(result.hasErrors()) {
			List<String> types = new ArrayList<String>();
			types.add("SELECT");
			types.add("Electronics");
			types.add("Grocery");
			types.add("Home Appliance");
			types.add("Stationery");
			model.put("dataitem", types);
			return "AddProduct";
		}else {
			prodService.addProduct(pro);
			return "home";
		}
	}

	@RequestMapping(value = "/showAll", method = RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Product> prodList = prodService.showProduct();
		return new ModelAndView("ShowProduct", "productData", prodList);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deletePage() {
		return "DeleteProduct";
	}

	@RequestMapping(value = "/deleteData", method = RequestMethod.POST)
	public String deleteData(@RequestParam("pid") Integer prodId) {
		prodService.removeProduct(prodId);
		return "redirect:/showAll";
	}
	
	@RequestMapping(value="/viewProduct", method=RequestMethod.GET)
	public ModelAndView findEmployee(@RequestParam("searchId")Integer prodId) {
		List<Product> prodList=new ArrayList<>();
		prodList.add(prodService.searchProduct(prodId));
		return new ModelAndView("SearchProduct","productData", prodList);
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String searchPage() {
		return "SearchProduct";
	}
}
