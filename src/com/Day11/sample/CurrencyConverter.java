package com.Day11.sample;


interface Currency{
	double dollarValue();
	
	static double convert(Currency source,Currency target,double amount) {
		return target.dollarValue() / source.dollarValue() * amount;
	}
	
	Currency USD = () -> 1.0;
	Currency INR = () -> 95.0;
	Currency AED = () -> 3.75;
	Currency YEN = () -> 120.0;
}

public class CurrencyConverter{
	public static void main(String[] args) {
		System.out.println(Currency.convert(Currency.YEN, Currency.INR, 240));
	}
}
