package com.cg.jdbc.service;

import java.math.BigInteger;

import com.cg.jdbc.dto.Author;

public interface AuthorService {

	public Author addAuthor(Author author);
	public Author updateAuthor(Author author);
	public Author findAuthor(BigInteger authorId);
	public boolean deleteAuthor(BigInteger authorId);
	
}
