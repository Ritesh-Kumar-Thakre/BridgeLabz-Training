package com.bridgelabz.oops.inheritance.assistedproblems;

public class EmployeeTest {
	public static void main(String[] args) {

        Employee e1 = new Manager("Rohit", 101, 85000, 8);
        Employee e2 = new Developer("Ritesh", 102, 65000, "Java");
        Employee e3 = new Intern("Aman", 103, 15000, "Rohit Sir");

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
    }
}
