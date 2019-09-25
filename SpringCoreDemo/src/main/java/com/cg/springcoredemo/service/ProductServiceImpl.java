package com.cg.springcoredemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springcoredemo.dao.ProductDao;
import com.cg.springcoredemo.dto.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	public Product addProduct(Product pro) {
		return productDao.addProduct(pro);
	}

	public List<Product> showProduct() {
		return productDao.showProduct();
	}

}
