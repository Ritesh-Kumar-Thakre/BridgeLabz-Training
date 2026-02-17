package com.day2.java8logicalquestions;

import java.util.Arrays;
import java.util.List;

public class SumAndMax {
	public static void main(String[] args) {
		// sum -> array
		int arr1[] = { 1, 2, 3, 4, 5 };
		int sum = Arrays.stream(arr1).sum();
		System.out.println(sum);

		// Sum -> List
		List<Integer> ss = Arrays.asList(1, 2, 3, 4, 5, 6);
		int c = ss.stream().mapToInt(e -> e.intValue()).sum();
		int cc = ss.stream().mapToInt(e -> e).sum();
		System.out.println(c + "" + cc);

		// max -> array
		int arr2[] = { 100, 342, 33, 242, 353, 0 };
		int max = Arrays.stream(arr2).max().orElse(0);
		System.out.println(max);

		// max -> list
		List<Integer> list = Arrays.asList(1, 2, 3,34, 4, 5, 6);
		int maxx = list.stream().mapToInt(e -> e).max().orElse(0);
		System.out.println(maxx);
	}
}
