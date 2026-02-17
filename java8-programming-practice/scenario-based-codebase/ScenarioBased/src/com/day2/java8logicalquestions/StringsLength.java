package com.day2.java8logicalquestions;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringsLength {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Java", "Python", ".net", "sql");
		System.out.println(strings);
//		strings.stream().map(String::length).forEach(System.out::print);
		List<Integer> lengths = strings.stream().map(String::length).collect(Collectors.toList());
		System.out.println(lengths);
	}
}
