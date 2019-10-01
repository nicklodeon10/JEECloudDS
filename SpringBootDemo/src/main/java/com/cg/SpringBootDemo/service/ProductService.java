package com.cg.SpringBootDemo.service;

import java.util.List;

import com.cg.SpringBootDemo.dto.Product;

public interface ProductService {

	public Product addProduct(Product product);
	
	public List<Product> showAll();
	
	public boolean removeProduct(Integer productId);
	
	public boolean updateProduct(Product product);
	
}
