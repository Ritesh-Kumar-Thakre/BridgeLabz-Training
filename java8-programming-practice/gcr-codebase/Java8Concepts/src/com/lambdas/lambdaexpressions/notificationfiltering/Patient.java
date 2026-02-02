package com.lambdas.lambdaexpressions.notificationfiltering;

public class Patient {
	String name;
	int age;
	boolean critical;

	public Patient(String name, int age, boolean critical) {
		this.name = name;
		this.age = age;
		this.critical = critical;
	}

	@Override
	public String toString() {
		return "Name: " + name + " | " + "Age: " + age;
	}

}
