package com.Day11.temperature;

public class TestTemperatureClass {
	public static void main(String[] args) {
		TemperatureConverter converter = new TemperatureConverter();
		System.out.println(converter.CToF(1));
		System.out.println(converter.FToC(34));
	}
}
