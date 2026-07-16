package com.aop;

import org.springframework.stereotype.Component;

@Component
public class Accounts {
	
	private double balance;
	
	public void deposit(double amount) {
		System.out.println("Deposited amount: "+amount);
	}
	
	public void withdraw(double amount) throws BalanceException{
//		if(amount <= balance) {
//			balance -=amount;
//			System.out.println("Withdraw Amount: "+amount);
//		}else {
			throw new BalanceException("Insufficient Balance");
//		}
	}
	
	public double getBalance() {
		System.out.println("Getting Balance: "+1000);
		return balance;
	}
	
	public void summary() {
		System.out.println("Account summary");
	}
	
	public void transfer(int src,int tgt,double amount) {
		System.out.println("Transfer Fund from "+src+" to "+tgt+" amount "+amount);
	}
	
}
