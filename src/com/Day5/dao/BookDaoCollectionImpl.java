package com.Day5.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.Day5.pojo.Book;

public class BookDaoCollectionImpl implements BookDao {
	
	private Vector<Book> books;
	
	public BookDaoCollectionImpl() {
		books = new Vector<Book>();
	}
	@Override
	public boolean save(Book b) {
		books.add(b);
		return true;
	}

	@Override
	public Book find(int isbn) {

		for(Book book: books) {
			if(book.getIsbn() == isbn) {
				return book;
			}
		}
		return null;
	}

	@Override
	public List<Book> list() {
		List<Book> temp = List.copyOf(books);
;		return temp;
	}

	@Override
	public boolean delete(int isbn) {
		for(Book book: books) {
			if(book.getIsbn() == isbn) {
				books.remove(book);
				return true;
			}
		}
		return false;
	}
	@Override
	public List<Book> findByPrice(double min, double max) {
		List<Book> list = new ArrayList<>();
		
		for(Book book: books) {
			if(book.getPrice() >= min && book.getPrice() <= max) {
				list.add(book);
			}
		}
		return list;
	}
	
	

}
