package com.collections.map;

public class Employee {
	String name;
	String department;

	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}
	

}
