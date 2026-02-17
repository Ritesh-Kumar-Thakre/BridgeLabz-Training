package com.day2.java8logicalquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyString {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("", "String", "String2", " ", "Ram");
		System.out.println(strings);
		List<String> result = strings.stream().filter(e -> !e.trim().isEmpty()).collect(Collectors.toList());
		System.out.println(result);
	}
}
