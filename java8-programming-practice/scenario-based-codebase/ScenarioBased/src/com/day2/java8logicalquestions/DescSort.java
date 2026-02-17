package com.day2.java8logicalquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescSort {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> reverse = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(numbers);
		System.out.println(reverse);
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::print);
	}
}
