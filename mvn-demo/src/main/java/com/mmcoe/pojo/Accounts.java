package com.mmcoe.pojo;

import com.mmcoe.pojo.BalanceException;
public class Accounts {
	private double balance;

	public Accounts(double balance) {
		this.balance = balance;
	}

	public Double getBalance() {
		return balance;
	}

	public double deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount should be positive");
		}

		this.balance += amount;
		return balance;

//		throws IllegalArgumentException
	}

	public double withdraw(double amount) throws BalanceException{
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount should be positive");
		}
		if (this.balance < amount) {
			throw new BalanceException("Insufficient Balance");
		}

		balance -= amount;
		return this.balance;

	}
}
