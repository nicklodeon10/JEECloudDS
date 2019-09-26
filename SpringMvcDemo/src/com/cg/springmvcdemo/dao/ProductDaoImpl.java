package com.cg.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao{

	List<Product> prodList=new ArrayList<>();
	
	@Override
	public Product addProduct(Product prod) {
		prodList.add(prod);
		return prod;
	}

	@Override
	public List<Product> showProduct() {
		return prodList;
	}

	@Override
	public Product findByProductId(int prodId) {
		for(Product product: prodList) {
			if(product.getProdId()==prodId) {
				return product;
			}
		}return null;
	}

}
