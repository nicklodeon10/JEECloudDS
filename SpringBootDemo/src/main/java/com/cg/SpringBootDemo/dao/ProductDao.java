package com.cg.SpringBootDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.SpringBootDemo.dto.Product;

@Repository("productDao")
public interface ProductDao extends JpaRepository<Product, Integer>{

}
