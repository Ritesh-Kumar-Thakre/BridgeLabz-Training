package com.day2.java8logicalquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachStrings {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Java", "Python", ".net");
		List<String> reversed = strings.stream().map(e -> new StringBuilder(e).reverse().toString()).toList();
		System.out.println(strings);
		System.out.println(reversed);

		String str = "string";
		String rev = str.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (a, b) -> b + a);
		System.out.println(rev);
	}
}
