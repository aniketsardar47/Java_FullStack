package com.Day11.temperature;

interface Temperature{
	double CToF(double cel);
	double FToC(double fah);
}

public class TemperatureConverter implements Temperature{
	
	@Override
	public double CToF(double cel) {
		return ((cel * 9.0 / 5.0) + 32.0);
	}

	@Override
	public double FToC(double fah) {
		return ((fah - 32.0) * 5.0 / 9.0);
	}
	
}
