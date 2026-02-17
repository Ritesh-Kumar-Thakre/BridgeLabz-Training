package com.day2.java8logicalquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringWithComma {
	public static void main(String[] args) {
		String[] arr = { "Java", "Spring", "Boot" };
		String str = Arrays.stream(arr).collect(Collectors.joining(","));
		System.out.println(str);

		List<String> list = Arrays.asList("Java", "Spring", "Boot");
		String str1 = list.stream().collect(Collectors.joining(","));
		System.out.println(str1);
	}
}