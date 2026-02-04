package com.day1.functionalinterfaces.customfunctionalinterface;

@FunctionalInterface
public interface LoanEligibility {
	boolean isEligible(double salary, int creditScore, int age);
}