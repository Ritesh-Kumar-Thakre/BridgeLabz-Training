package com.functionalinterfaces.functionalinterface.temperaturealertsystem;

import java.util.function.Predicate;

public class TempAlert {
	public static void main(String[] args) {
		double threshold = 200.0;
		Predicate<Double> alert = temp -> temp > threshold;

		double currentTemp = 233.0;
		if (alert.test(currentTemp)) {
			System.out.println("Alert: high temp");
		} else {
			System.out.println("Temp is in control");
		}
	}
}