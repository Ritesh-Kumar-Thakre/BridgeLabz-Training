package com.day2.java8logicalquestions;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class UpperCaseStringList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> strings = Arrays.asList("Java", "Python", "Net", "Spring");
		strings.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		sc.close();
	}
}
