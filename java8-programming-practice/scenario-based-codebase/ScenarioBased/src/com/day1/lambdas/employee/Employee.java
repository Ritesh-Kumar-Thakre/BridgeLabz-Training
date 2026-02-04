package com.day1.lambdas.employee;

public class Employee {
	String name;
	double salary;
	int experienceYears;

	public Employee(String name, double salary, int experienceYears) {
		this.name = name;
		this.salary = salary;
		this.experienceYears = experienceYears;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', salary=" + salary + ", exp=" + experienceYears + "}";
	}
}