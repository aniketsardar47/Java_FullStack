package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mmcoe.pojo.Accounts;
import com.mmcoe.pojo.BalanceException;
public class TestAccount {
	private static Accounts b;
	
	
	@BeforeEach
	public void init() {
		b = new Accounts(1000);
	}
	
	@Test
	public void testGetBalance() {
		assertEquals(1000,b.getBalance());
	}
	
	@Test
	public void testDeposit() {
		assertEquals(2000,b.deposit(1000));
	}
	
	@Test
	public void testNegativeDeposit() {
		assertThrows(IllegalArgumentException.class,()->b.deposit(-100));
	}
	
	@Test
	public void testWithdraw() throws BalanceException{
		assertEquals(900, b.withdraw(100));
	}
	
	@Test
	public void testNegativeWithdraw() {
		assertThrows(IllegalArgumentException.class,()->b.withdraw(-100));
	}
	
	@Test
	public void testInvalidWithdraw() {
		assertThrows(BalanceException.class,()->b.withdraw(2000));
	}
	
	
	
	
}
