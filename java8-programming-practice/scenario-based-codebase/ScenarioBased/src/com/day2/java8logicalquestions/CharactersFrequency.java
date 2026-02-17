package com.day2.java8logicalquestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharactersFrequency {
	public static void main(String[] args) {
		// frequency of string chars
		String str = "banana";
		Map<Character, Long> freq1 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		System.out.println(freq1);

		// frequency of list chars
		List<Character> chars = Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'j', 'h', 'g', 'g', 'f', 'd', 'c', 'v',
				'n', 'y');
		Map<Character, Long> freq = chars.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(freq);
	}
}
