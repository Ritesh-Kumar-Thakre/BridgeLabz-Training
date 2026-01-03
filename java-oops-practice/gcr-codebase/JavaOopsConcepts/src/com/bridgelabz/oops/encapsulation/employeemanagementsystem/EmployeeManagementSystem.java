package com.bridgelabz.oops.encapsulation.employeemanagementsystem;

import java.util.ArrayList;

public class EmployeeManagementSystem {
	public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee e1 =
                new FullTimeEmployee(101, "Ritesh", 30000);
        e1.assignDepartment("IT");

        PartTimeEmployee e2 =
                new PartTimeEmployee(102, "Aman", 500, 60);
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println(((Department) emp).getDepartmentDetails());
            System.out.println("---------------------------------");
        }
    }
}
