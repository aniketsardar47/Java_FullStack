package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.mmcoe.dao.OrderDao;
import com.mmcoe.entity.Order;

public class testPlaceOrder {
	
	public static OrderDao dao;
	
	@BeforeAll
	public static void init() {
		dao = new OrderDao();
	}
	
	@Test
	public void testPlaceOrder() {
		Order o = new Order(LocalDate.of(2026,05,23),4000);
		assertNotNull(dao.placeOrder(o,12));
	}
	
	@Test
	public void testfindByCustomer() {
		List<Order> orders = dao.findByCustomer(11);
		assertFalse(orders.isEmpty());
		orders.forEach(System.out::println);
	}
	
	@Test
	public void findByDateRange() {
		List<Order> orders = dao.findByDateRange(LocalDate.of(2026, 01,23),LocalDate.of(2026, 06, 23));
		assertFalse(orders.isEmpty());
		orders.forEach(System.out::println);
	}
}
