package com.day1.functionalinterfaces.customfunctionalinterface;

@FunctionalInterface
public interface BonusCalculator {
	double calculate(double salary, int performanceScore);
}