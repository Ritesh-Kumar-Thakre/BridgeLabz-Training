package com.collectors.wordfrequencycounter;

import java.util.*;
import java.util.stream.Collectors;

public class CountFreq {
	public static void main(String[] args) {
		String paragraph = "ritesh thakre is in in  tranning";
		Map<String, Integer> freq = Arrays.stream(paragraph.split("\\s+"))
				.collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));
		System.out.println(freq);

	}
}
