package com.cg.springmvcdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao{

	@PersistenceContext
	EntityManager manager;
	
	@Override
	public Product addProduct(Product prod) {
		manager.persist(prod);
		return prod;
	}

	@Override
	public List<Product> showProduct() {
		TypedQuery<Product> query=manager.createQuery("FROM Product", Product.class);
		return query.getResultList();
	}

	@Override
	public Product findByProductId(int prodId) {
		TypedQuery<Product> query=manager.createQuery("FROM Product WHERE prodId=?", Product.class);
		query.setParameter(0, prodId);
		return query.getSingleResult();
	}

	@Override
	public void removeProduct(int prodId) {
		manager.remove(manager.find(Product.class, prodId));
	}

}
