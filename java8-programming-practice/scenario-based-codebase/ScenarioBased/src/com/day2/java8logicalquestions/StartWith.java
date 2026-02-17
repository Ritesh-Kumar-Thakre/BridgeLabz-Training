package com.day2.java8logicalquestions;

import java.util.Arrays;
import java.util.List;

public class StartWith {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("String", "apnosis", "aaryan", "anuj", "poinky");
		System.out.println(strings);
		int count = (int) strings.stream().filter(e -> e.startsWith("a")).count();
		System.out.println(count);
	}
}
