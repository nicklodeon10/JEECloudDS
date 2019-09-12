package com.cg.jdbc.service;

import java.math.BigInteger;

import com.cg.jdbc.dao.AuthorDao;
import com.cg.jdbc.dao.AuthorDaoImpl;
import com.cg.jdbc.dto.Author;

public class AuthorServiceImpl implements AuthorService {

	AuthorDao authorDao=new AuthorDaoImpl();
	
	public Author addAuthor(Author author) {
		return authorDao.addAuthor(author);
	}

	public Author updateAuthor(Author author) {
		return authorDao.updateAuthor(author);
	}

	public Author findAuthor(BigInteger authorId) {
		return authorDao.findAuthor(authorId);
	}

	public boolean deleteAuthor(BigInteger authorId) {
		return authorDao.deleteAuthor(authorId);
	}

}
