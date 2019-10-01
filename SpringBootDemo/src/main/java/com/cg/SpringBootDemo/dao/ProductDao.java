package com.cg.SpringBootDemo.dao;

import java.util.List;

import com.cg.SpringBootDemo.dto.Product;

public interface ProductDao {

	public Product addProduct(Product product);

	public List<Product> showAll();
	
	public boolean removeProduct(Integer productId);
	
	public boolean updateProduct(Product product);

}
