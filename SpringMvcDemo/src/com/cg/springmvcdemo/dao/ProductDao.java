package com.cg.springmvcdemo.dao;

import java.util.List;

import com.cg.springmvcdemo.dto.Product;

public interface ProductDao {

	public Product addProduct(Product prod);

	public List<Product> showProduct();

	public Product findByProductId(int prodId);

	public void removeProduct(int prodId);

}
