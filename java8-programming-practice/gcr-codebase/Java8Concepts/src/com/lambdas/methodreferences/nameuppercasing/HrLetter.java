package com.lambdas.methodreferences.nameuppercasing;

import java.util.*;

public class HrLetter {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ritesh", 21, 452);
		Employee e2 = new Employee("Raj", 23, 411);
		Employee e3 = new Employee("Ram", 42, 401);
		Employee e4 = new Employee("Sohan", 32, 531);
		Employee e5 = new Employee("Ramu", 51, 242);
		List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5);
		System.out.println("HR Letter Names:");
		empList.stream().map(e -> e.name).map(String::toUpperCase).forEach(System.out::println);
	}
}
