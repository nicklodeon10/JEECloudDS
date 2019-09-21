package com.cg.jpalabbook.dto;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger ISBN;
	@Column
	private String title;
	@Column
	private Double price;
	
	private List<Author> authorList;
	
	public Book() {
		super();
	}
	
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + ", authorList=" + authorList + "]";
	}

	public Book(BigInteger iSBN, String title, Double price, List<Author> authorList) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.authorList = authorList;
	}

	public BigInteger getISBN() {
		return ISBN;
	}
	public void setISBN(BigInteger iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	} 
	
}
