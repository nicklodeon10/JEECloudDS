package com.cg.springcoredemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springcoredemo.dto.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {

	List<Product> myList=new ArrayList<>();
	
	public Product addProduct(Product pro) {
		myList.add(pro);
		return pro;
	}

	public List<Product> showProduct() {
		return myList;
	}

}
