package com.cg.SpringBootDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.SpringBootDemo.dao.ProductDao;
import com.cg.SpringBootDemo.dto.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	}

	@Override
	public List<Product> showAll() {
		return productDao.showAll();
	}

	@Override
	public boolean removeProduct(Integer productId) {
		return productDao.removeProduct(productId);
	}

	@Override
	public boolean updateProduct(Product product) {
		return productDao.updateProduct(product);
	}

}
