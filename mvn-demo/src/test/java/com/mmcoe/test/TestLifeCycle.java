package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLifeCycle {
	
	static {
		Configurator.setRootLevel(Level.INFO);
	}
	
	private static final Logger logger = LogManager.getLogger(TestLifeCycle.class);
	
	private List<String> items;
	
	@BeforeAll
	public static void beforeAll() {
		logger.debug("Executes Before all test cases");
	}
	
	@AfterAll
	public static void afterAll() {
		logger.debug("Executes After all test cases");
	}
	
	@BeforeEach
	public void init() {
		items = new ArrayList<>();
		logger.debug("Executes before each test cases");
	}
	
	@AfterEach
	public void clean() {
		items = null;
		logger.debug("Executes after each test cases");
	}
	
	@Test
	public void testEmptyList(){
		assertTrue(items.isEmpty());
	}
	
	@Test
	public void testOneItem() {
		assertEquals(0,items.size());
	}
}
