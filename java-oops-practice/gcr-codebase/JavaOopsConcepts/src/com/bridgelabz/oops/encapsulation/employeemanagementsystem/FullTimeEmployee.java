package com.bridgelabz.oops.encapsulation.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department {

	private String department;

	public FullTimeEmployee(int id, String name, double baseSalary) {
		super(id, name, baseSalary);
	}

	@Override
	public double calculateSalary() {
		return getBaseSalary() + (getBaseSalary() * 0.10);
	}

	@Override
	public void assignDepartment(String deptName) {
		this.department = deptName;
	}

	@Override
	public String getDepartmentDetails() {
		return "Department: " + department;
	}
}
