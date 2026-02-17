package com.day2.java8logicalquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		int secondHighest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println(secondHighest);
		
		int highest = list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().orElse(0);
		System.out.println(highest);


		int[] arr = { 12, 2, 4, 3, 355555, 34, 234, 5, 5324, 4234, 535, 25, 2, 52, 5, 2, 523525, 2, 52, 523, 52, 35 };
		Integer snd = Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
		System.out.println(snd);
	}
}
