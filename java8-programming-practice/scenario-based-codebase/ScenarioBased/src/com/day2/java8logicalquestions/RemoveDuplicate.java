package com.day2.java8logicalquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 6, 7);
		List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(unique);
	}
}
