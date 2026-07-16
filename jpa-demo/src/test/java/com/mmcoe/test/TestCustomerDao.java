package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.mmcoe.dao.CustomerDao;
import com.mmcoe.entity.Customer;

public class TestCustomerDao {
	public static CustomerDao dao;
	
	@BeforeAll
	public static void init() {
		dao = new CustomerDao();
	}
	
	@Test
	public void testSave() {
		Customer c = new Customer(15, "Frank","Fairfox");
		
		assertNotNull(dao.save(c));
	}
	
	@Test
	public void testFind() {
		Customer c = dao.find(11);
		assertNotNull(c);
		System.out.println(c);
	}
	
	@Test
	public void testList() {
		List<Customer> customers = dao.list();
		assertFalse(customers.isEmpty());
		customers.forEach(System.out::println);
	}
	
	@Test
	public void delete() {
		assertTrue(dao.delete(15));
	}
}
