package com.day2.java8logicalquestions;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String str = "stress";
		Character result = str.chars()
							.mapToObj(c -> (char) c)
							.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
							.entrySet()
							.stream()
							.filter(entry -> entry.getValue() == 1)
							.map(Map.Entry::getKey)
							.findFirst().orElse(null);
		System.out.println(result);
	}
}
