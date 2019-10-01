package com.cg.SpringBootDemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.SpringBootDemo.dto.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {

	List<Product> prodList=new ArrayList<>();
	
	@Override
	public Product addProduct(Product product) {
		prodList.add(product);
		return product;
	}

	@Override
	public List<Product> showAll() {
		return prodList;
	}

	@Override
	public boolean removeProduct(Integer productId) {
		for(Product product: prodList) {
			if(product.getProdId()==productId) {
				prodList.remove(product);
				return true;
			}
		}return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		for(Product pro: prodList) {
			if(product.getProdId().equals(pro.getProdId())) {
				pro.setProdName(product.getProdName());
				pro.setProdCost(product.getProdCost());
				pro.setProdDescription(product.getProdDescription());
				return true;
			}
		}return false;
	}

}
