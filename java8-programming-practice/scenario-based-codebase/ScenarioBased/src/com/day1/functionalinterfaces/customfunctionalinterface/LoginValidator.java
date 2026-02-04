package com.day1.functionalinterfaces.customfunctionalinterface;

@FunctionalInterface
public interface LoginValidator {
	boolean validate(String username, String password);
}