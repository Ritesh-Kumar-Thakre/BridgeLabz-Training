package com.day2.java8logicalquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLength {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("fo", "and", "fono", "ed", "gd", "sdf", "tf");
		Map<Integer, List<String>> counts = strings.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(counts);
	}
}
