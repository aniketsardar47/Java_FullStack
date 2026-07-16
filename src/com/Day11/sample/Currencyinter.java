package com.Day11.sample;

public interface Currencyinter{
	double dollarValue();
	
	static double convert(Currencyinter source,Currencyinter target,double amount) {
		return target.dollarValue() / source.dollarValue() * amount;
	}
	
	Currencyinter USD = () -> 1.0;
	Currencyinter INR = () -> 95.5;
	Currencyinter AED = () -> 3.75;
}
