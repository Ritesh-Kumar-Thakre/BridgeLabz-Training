package com.day2.java8logicalquestions;

import java.util.Arrays;
import java.util.List;

public class NumbersGraterThenTarget {
	public static void main(String[] args) {
		int target = 50;
		List<Integer> list = Arrays.asList(54, 36, 27, 53, 37, 86, 56, 78, 55, 43, 89, 85, 44, 77, 54);
		list.stream().filter(e -> e > target).forEach(System.out::println);
	}
}
