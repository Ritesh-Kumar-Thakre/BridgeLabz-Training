package com.jdbc.employee;

import java.util.List;
import java.util.Scanner;

public class Main {

	private static final EmployeeDAO dao = new EmployeeDAO();
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("\n===== Employee Management System =====");
			System.out.println("1. Add Employee");
			System.out.println("2. View All Employees");
			System.out.println("3. Update Salary");
			System.out.println("4. Delete Employee");
			System.out.println("5. Search Employee by Name");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addEmployee();
				break;
			case 2:
				viewAll();
				break;
			case 3:
				updateSalary();
				break;
			case 4:
				deleteEmployee();
				break;
			case 5:
				searchEmployee();
				break;
			case 6: {
				System.out.println("Exiting...");
				return;
			}
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	private static void addEmployee() {
		System.out.print("Enter ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Age: ");
		int age = scanner.nextInt();

		System.out.print("Enter Salary: ");
		double salary = scanner.nextDouble();

		Employee emp = new Employee(id, name, age, salary);

		if (dao.addEmployee(emp))
			System.out.println("Employee Added Successfully!");
		else
			System.out.println("Failed to Add Employee!");
	}

	private static void viewAll() {
		List<Employee> list = dao.getAllEmployees();
		list.forEach(System.out::println);
	}

	private static void updateSalary() {
		System.out.print("Enter Employee ID: ");
		int id = scanner.nextInt();

		System.out.print("Enter New Salary: ");
		double salary = scanner.nextDouble();

		if (dao.updateSalary(id, salary))
			System.out.println("Salary Updated!");
		else
			System.out.println("Employee Not Found!");
	}

	private static void deleteEmployee() {
		System.out.print("Enter Employee ID: ");
		int id = scanner.nextInt();

		if (dao.deleteEmployee(id))
			System.out.println("Employee Deleted!");
		else
			System.out.println("Employee Not Found!");
	}

	private static void searchEmployee() {
		scanner.nextLine();
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();

		List<Employee> list = dao.searchByName(name);
		list.forEach(System.out::println);
	}
}
