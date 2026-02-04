package com.day1.functionalinterfaces.customfunctionalinterface;

@FunctionalInterface
public interface TaxCalculator {
	double computeTax(double income);
}