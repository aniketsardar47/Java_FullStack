package com.Day5.service;

import java.util.List;

import com.Day5.dao.BookDao;
import com.Day5.pojo.Book;

public class BookServiceImpl implements BookService {
	
	private BookDao dao;
	
	//  Dependency Injection
	public BookServiceImpl(BookDao dao) {
		this.dao = dao;
	}
	@Override
	public boolean save(Book b) {
		return dao.save(b);
	}

	@Override
	public Book find(int isbn) throws BookNotFoundException {
		Book b = dao.find(isbn);
		if(b == null)
			throw new BookNotFoundException("Book not found with the given isbn: "+isbn);
		return b;
	}

	@Override
	public List<Book> list() {
		return dao.list();
	}

	@Override
	public boolean delete(int isbn) throws BookNotFoundException {
		if(dao.delete(isbn)) {
			return true;
		}else {
			throw new BookNotFoundException("Book not found with the given isbn: "+isbn);
		}
	}

	@Override
	public List<Book> findByPrice(double min, double max) {
		return dao.findByPrice(min, max);
	}

}
