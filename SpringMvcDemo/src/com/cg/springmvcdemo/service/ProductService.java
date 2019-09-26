package com.cg.springmvcdemo.service;

import java.util.List;

import com.cg.springmvcdemo.dto.Product;

public interface ProductService {

	public Product addProduct(Product prod);

	public List<Product> showProduct();

	public Product searchProduct(int prodId);
	
	public void removeProduct(int prodId);

}
