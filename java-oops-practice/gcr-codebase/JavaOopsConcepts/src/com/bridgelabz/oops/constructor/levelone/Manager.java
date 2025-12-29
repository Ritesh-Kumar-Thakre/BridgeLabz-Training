package com.bridgelabz.oops.constructor.levelone;

public class Manager extends Employee {
	public Manager(int employeeID,String department,double salary) {
		super(employeeID, department, salary);
	}
	
	public void employeeData() {
		System.out.println("Employee ID "+employeeID);
		System.out.println("Department "+department);
		System.out.println("Salary "+getSalary());
	}
	
	public static void main(String[] args) {
		Manager m=new Manager(74673257, "IOT", 1040400.44);
		m.printEmployeeData();
	}
}
