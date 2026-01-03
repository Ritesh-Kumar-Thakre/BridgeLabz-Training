package com.bridgelabz.oops.encapsulation.employeemanagementsystem;

abstract class Employee {
	private int employeeId;
	private String name;
	private double baseSalary;
	
	public abstract double calculateSalary();
	
	public Employee(int employeeId,String name,double baseSalary) {
		this.employeeId=employeeId;
		this.name=name;
		this.baseSalary=baseSalary;
	}
	
	// Encapsulation: getters / setters
    public int getEmployeeId() {
    	return employeeId; 
    }
    
    public String getName() { 
    	return name; 
    }
    
    public double getBaseSalary() { 
    	return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}
