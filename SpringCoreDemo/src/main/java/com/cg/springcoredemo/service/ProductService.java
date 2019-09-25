package com.cg.springcoredemo.service;

import java.util.List;

import com.cg.springcoredemo.dto.Product;

public interface ProductService {

	public Product addProduct(Product pro);
	public List<Product> showProduct();
	
}
