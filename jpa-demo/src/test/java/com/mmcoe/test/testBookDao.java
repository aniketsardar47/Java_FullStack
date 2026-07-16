package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mmcoe.dao.BookDao;
import com.mmcoe.entity.Book;

public class testBookDao {
	public static BookDao dao;
	
	@BeforeEach
	public void init() {
		dao = new BookDao();
	}
	
	@Test
	public void testSave() {
		Book b = new Book(1,"Let us C","Yashwant Kanetkar",150.25);
		assertNotNull(dao.save(b));
	}
	
	@Test
	public void testFind() {
		Book b = dao.find(1);
		assertNotNull(b);
		System.out.println(b);
	}
	
	@Test
	public void testList() {
		List<Book> lst = dao.list();
		assertFalse(lst.isEmpty());
		lst.forEach(System.out::println);
	}
	
	@Test
	public void testDelete() {
		assertTrue(dao.delete(1));
	}
	
}
