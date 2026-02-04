package com.day1.functionalinterfaces.function;

import java.util.*;
import java.util.function.Function;

public class ProblemsSoln {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Ritesh", 78.55), new Student("Raj", 68.55),
				new Student("Ram", 98.55));
		Function<Double, Character> fun = e -> {
			if (e > 90) {
				return 'A';
			} else if (e < 90 && e > 80) {
				return 'B';
			} else if (e < 80 && e > 70) {
				return 'C';
			} else if (e < 70 && e > 60) {
				return 'D';
			} else if (e < 60 && e > 50) {
				return 'E';
			}
			return 'F';
		};
		students.forEach(e -> System.out.println(fun.apply(e.marks)));

		// 2. Monthly to Annual salary
		Function<Double, Double> annualSalary = monthly -> monthly * 12;
		System.out.println("\n2. Annual Salary:");
		System.out.println("Rs. 45,000/month ==> Rs. " + annualSalary.apply(45000.0));

		// 3. Discounted price (15% off)
		Function<Double, Double> discountedPrice = price -> price * 0.85;
		System.out.println("\n3. Discounted price (15% off):");
		System.out.println("Rs. 1200 ==> Rs. " + discountedPrice.apply(1200.0));

		// 4. Name to uppercase
		Function<String, String> toUpper = String::toUpperCase;
		System.out.println("\n4. Uppercase name:");
		System.out.println("Rahul ==> " + toUpper.apply("Rahul"));

		// 5. Celsius to Fahrenheit
		Function<Double, Double> cToF = c -> (c * 9 / 5) + 32;
		System.out.println("\n5. Celsius to Fahrenheit:");
		System.out.println("25°C ==> " + cToF.apply(25.0) + "°F");
	}
}
