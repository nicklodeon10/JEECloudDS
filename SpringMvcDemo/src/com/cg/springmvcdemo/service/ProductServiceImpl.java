package com.cg.springmvcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcdemo.dao.ProductDao;
import com.cg.springmvcdemo.dto.Product;

@Service("prodService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public Product addProduct(Product prod) {
		return productDao.addProduct(prod);
	}

	@Override
	public List<Product> showProduct() {
		return productDao.showProduct();
	}

	@Override
	public Product searchProduct(int prodId) {
		return productDao.findByProductId(prodId);
	}

	@Override
	public void removeProduct(int prodId) {
		productDao.removeProduct(prodId);
	}

}
