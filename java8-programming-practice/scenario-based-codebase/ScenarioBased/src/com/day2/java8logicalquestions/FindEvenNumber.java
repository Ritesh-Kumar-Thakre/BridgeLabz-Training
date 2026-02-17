package com.day2.java8logicalquestions;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.stream.Collectors;

public class FindEvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		System.out.print("Enter how many numbers to add in list: ");
		int n = sc.nextInt();
		while (n != 0) {
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			numbers.add(num);
			n--;
		}
		System.out.println("Even numbers: ");
		numbers.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
//		System.out.println("Even numbers after storing in list: ");
//		List<Integer> result = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
//
//		for (int i = 0; i < result.size(); i++) {
//			System.out.println(result.get(i));
//		}
		sc.close();
	}
}
