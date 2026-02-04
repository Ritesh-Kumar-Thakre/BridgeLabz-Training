package com.day1.employee;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Implement {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "Ritesh", 21, "male", "IT", LocalDate.of(2015, 6, 23), 50000),
				new Employee(2, "Amit", 24, "male", "HR", LocalDate.of(2013, 3, 12), 42000),
				new Employee(3, "Neha", 22, "female", "Sales", LocalDate.of(2024, 1, 18), 48000),
				new Employee(4, "Rahul", 27, "male", "IT", LocalDate.of(2012, 7, 5), 60000),
				new Employee(5, "Pooja", 23, "female", "IT", LocalDate.of(2023, 11, 25), 50000),
				new Employee(6, "Vikas", 29, "male", "IT", LocalDate.of(2021, 4, 10), 65000),
				new Employee(7, "Sneha", 25, "female", "HR", LocalDate.of(2022, 9, 14), 42000),
				new Employee(8, "Ravi", 31, "male", "HR", LocalDate.of(2020, 2, 20), 70000),
				new Employee(9, "Anjali", 24, "female", "Sales", LocalDate.of(2013, 6, 30), 43000),
				new Employee(10, "Kiran", 26, "male", "Finance", LocalDate.of(2022, 12, 8), 48000),
				new Employee(11, "Suman", 28, "female", "IT", LocalDate.of(2021, 8, 19), 60000),
				new Employee(12, "Arjun", 22, "male", "Sales", LocalDate.of(2024, 5, 3), 45000),
				new Employee(13, "Nikita", 27, "female", "IT", LocalDate.of(2022, 10, 17), 52000),
				new Employee(14, "Deepak", 33, "male", "HR", LocalDate.of(2019, 1, 9), 75000),
				new Employee(15, "Kavita", 24, "female", "HR", LocalDate.of(2023, 4, 22), 42000),
				new Employee(16, "Manish", 30, "male", "Finance", LocalDate.of(2020, 6, 15), 68000),
				new Employee(17, "Priya", 22, "female", "Sales", LocalDate.of(2025, 2, 1), 48000),
				new Employee(18, "Sanjay", 35, "male", "Sales", LocalDate.of(2018, 3, 28), 90000),
				new Employee(19, "Komal", 26, "female", "IT", LocalDate.of(2022, 5, 11), 55000),
				new Employee(20, "Nitin", 29, "male", "HR", LocalDate.of(2021, 9, 7), 65000));

		// 1. How many male and female employees are there in the organization ?
		long maleCount = employees.stream().filter(e -> e.getGender().equalsIgnoreCase("male")).count();
		System.out.println("Male Employee:- " + maleCount);

		long femaleCount = employees.stream().filter(e -> e.getGender().equalsIgnoreCase("female")).count();
		System.out.println("Male Employee:- " + femaleCount);
		System.out.println("-----------------------------------------------------------------------");

		// 2. Print the name of all departments in the organization ?
		System.out.print("All departments:- ");
		employees.stream().map(e -> e.getDepartment()).distinct().forEach(d -> System.out.print(d + " "));
		System.out.println("\n-----------------------------------------------------------------------");

		// 3. What is the average age of male and female employees ?
		double maleAvg = employees.stream().filter(e -> e.getGender().equalsIgnoreCase("male"))
				.mapToInt(Employee::getAge).average().orElse(0);
		System.out.println("Average male age:- " + (int) maleAvg);

		double femaleAvg = employees.stream().filter(e -> e.getGender().equalsIgnoreCase("female"))
				.mapToInt(Employee::getAge).average().orElse(0);
		System.out.println("Average female age:- " + (int) femaleAvg);
		System.out.println("-----------------------------------------------------------------------");

		// 4. Get the details of highest paid employee in the organization ?
		Employee highestSalary = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		if (highestSalary != null) {
			System.out.println("Highest salary employee:- " + highestSalary);
		}
		System.out.println("-----------------------------------------------------------------------");

		// 5. Get the names of all employees who have joined after 2015 ?
		System.out.println("Employees joined after 2015:- ");
		employees.stream().filter(e -> e.getYearOfJoining().isAfter(LocalDate.of(2015, 12, 31)))
				.forEach(d -> System.out.print(d.getName() + ", "));
		System.out.println("\n-----------------------------------------------------------------------");

		// 6. Count the number of employees in each department ?
		long iTCount = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("IT")).count();
		System.out.println("Total IT employees:- " + iTCount);

		long hRCount = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("HR")).count();
		System.out.println("Total HR employees:- " + hRCount);

		long salesCount = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Marketing")).count();
		System.out.println("Total Sales employees:- " + salesCount);

		long financeCount = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Finance")).count();
		System.out.println("Total Finance employees:- " + financeCount);
		System.out.println("-----------------------------------------------------------------------");

		// 7. What is the average salary of each department ?
		double iTAvg = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
				.mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println("Average IT Department salary:- " + iTAvg);

		double hRAvg = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("HR"))
				.mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println("Average HR Department salary:- " + hRAvg);

		double salesAvg = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Marketing"))
				.mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println("Average Sales Department salary:- " + salesAvg);

		double financeAvg = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Finance"))
				.mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println("Average Finance Department salary:- " + financeAvg);
		System.out.println("-----------------------------------------------------------------------");

		// 8. Get the details of youngest male employee in the product development
		// department ?
		Employee youngest = employees.stream().min(Comparator.comparing(Employee::getAge)).orElse(null);
		if (youngest != null) {
			System.out.print("Youngest employee:- ");
			System.out.println(youngest);
		}
		System.out.println("-----------------------------------------------------------------------");

		// 9. Who has the most working experience in the organization ?
		Employee experienced = employees.stream().min(Comparator.comparing(Employee::getYearOfJoining)).orElse(null);
		if (experienced != null) {
			System.out.print("Most experienced:- ");
			System.out.println(experienced);
		}
		System.out.println("-----------------------------------------------------------------------");

		// 10. How many male and female employees are there in the Sales team ?
		long maleCountSales = employees.stream().filter(s -> s.getGender().equalsIgnoreCase("male"))
				.filter(e -> e.getDepartment().equalsIgnoreCase("Sales")).count();
		System.out.println("Male count in sales department: " + maleCountSales);

		long femaleCountSales = employees.stream().filter(s -> s.getGender().equalsIgnoreCase("female"))
				.filter(e -> e.getDepartment().equalsIgnoreCase("Sales")).count();
		System.out.println("Female count in sales department: " + femaleCountSales);
		System.out.println("-----------------------------------------------------------------------");

		// 11. What is the average salary of male and female employees ?
		double avgMaleSalary = employees.stream().filter(e -> e.getGender().equalsIgnoreCase("male"))
				.mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println("Average salary of male's: " + avgMaleSalary);

		double avgFemaleSalary = employees.stream().filter(e -> e.getGender().equalsIgnoreCase("female"))
				.mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println("Average salary of female's: " + avgFemaleSalary);
		System.out.println("-----------------------------------------------------------------------");

		// 12. List down the names of all employees in each department ?
		System.out.println("IT employees name's:- ");
		employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
				.forEach(d -> System.out.print(d.getName() + ", "));

		System.out.println("\nHR employees name's:- ");
		employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("HR"))
				.forEach(d -> System.out.print(d.getName() + ", "));

		System.out.println("\nFinance employees name's:- ");
		employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Finance"))
				.forEach(d -> System.out.print(d.getName() + ", "));

		System.out.println("\nSales employees name's:- ");
		employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Sales"))
				.forEach(d -> System.out.print(d.getName() + ", "));
		System.out.println("\n-----------------------------------------------------------------------");

		// 13. What is the average salary and total salary of the whole organization ?
		double totalAvgSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
		System.out.println("Total average salary: " + totalAvgSalary);

		double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Total salary: " + totalSalary);
		System.out.println("-----------------------------------------------------------------------");

		// 14. Get the employee whose salary are more than 25k.
		System.out.println("Employees with more then 25k salary:- ");
		employees.stream().filter(e -> e.getSalary() >= 25000).forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------");

		// 15. Who is the highest paid employee in the organization?
		Employee highestPay = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
		System.out.println("Highest Paid Employee is: " + highestPay.getName());
		System.out.println("-----------------------------------------------------------------------");

		// 16. Who is the second highest paid employee in the organization?
		Employee secondHighestPay = employees.stream().filter(e -> e.getSalary() < highestPay.getSalary())
				.max(Comparator.comparing(Employee::getSalary)).orElse(null);
		System.out.println("Second Highest Paid Employee is: " + secondHighestPay.getName());
		System.out.println("-----------------------------------------------------------------------");

		// 17. Who is the third highest paid employee in the organization?
		Employee thirdHighestPay = employees.stream().filter(e -> e.getSalary() < secondHighestPay.getSalary())
				.max(Comparator.comparing(Employee::getSalary)).orElse(null);
		System.out.println("Third Highest Paid Employee is: " + thirdHighestPay.getName());
		System.out.println("-----------------------------------------------------------------------");

		// 18. Who is the lowest paid employee in the organization?
		double lowestPay = employees.stream().mapToDouble(Employee::getSalary).min().orElse(0);

		List<Employee> lowestPays = employees.stream().filter(e -> e.getSalary() == lowestPay)
				.collect(Collectors.toList());

		System.out.println("Lowest paid employees:- ");
		lowestPays.forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));
		System.out.println("-----------------------------------------------------------------------");

		// 19. Who is the second lowest paid employee in the organization?
		Employee secondLowestPaid = employees.stream().filter(e -> e.getSalary() > lowestPay)
				.min(Comparator.comparing(Employee::getSalary)).orElse(null);
		System.out.println("Second lowest paid: " + secondLowestPaid.getName());
		System.out.println("-----------------------------------------------------------------------");

		// 20. Get the first five lowest paid employee in the organization?
		System.out.println("Five lowest paid employees:- ");
		employees.stream().filter(e -> e.getSalary() >= lowestPay)
				.sorted(Comparator.comparingDouble(Employee::getSalary)).limit(5)
				.forEach(e -> System.out.println(e.getName() + " : " + e.getSalary()));
		System.out.println("-----------------------------------------------------------------------");

		// 21. Get the first five highest paid employee in the organization?
		System.out.println("Five highest paid employees:- ");
		employees.stream().filter(e -> e.getSalary() <= highestPay.getSalary())
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(5)
				.forEach(e -> System.out.println(e.getName() + " : " + e.getSalary()));

		System.out.print("-----------------------------------------------------------------------");

	}
}