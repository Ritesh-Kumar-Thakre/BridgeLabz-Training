package com.day1.functionalinterfaces.comparator;

import java.util.Comparator;

public class ProblemSoln {
	public static void main(String[] args) {
		Student stu1 = new Student("Ritesh", 312);
		Student stu2 = new Student("Raj", 423);
		Comparator<Integer> compRank = Integer::compareTo;
		System.out.println(stu1.rank + "," + stu2.rank + " --> " + compRank.compare(stu1.rank, stu2.rank));

		// 2. Employees by salary
		Comparator<Double> bySalary = Double::compareTo;
		System.out.println("2. Salary comparison: 52000 vs 38000 ==> " + bySalary.compare(52000.0, 38000.0));

		// 3. Products by price
		Comparator<Product> byPrice = (p1, p2) -> Double.compare(p1.price, p2.price);
		System.out.println("3. Product price comparison:");
		Product p1 = new Product("Laptop", 72000);
		Product p2 = new Product("Phone", 45000);
		System.out
				.println(p1 + " vs " + p2 + " ==> " + (byPrice.compare(p1, p2) > 0 ? "p1 expensive" : "p2 expensive"));

		// 4. Strings by length
		Comparator<String> byLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		System.out.println("4. Length comparison: \"Java\" vs \"Lambda\" ==> " + byLength.compare("Java", "Lambda"));

		// 5. Bank accounts by balance
		Comparator<Double> byBalance = Comparator.reverseOrder(); // descending
	}
}
