package com.cg.springcoredemo.dao;

import java.util.List;

import com.cg.springcoredemo.dto.Product;

public interface ProductDao {

	public Product addProduct(Product pro);
	public List<Product> showProduct();
	
}
