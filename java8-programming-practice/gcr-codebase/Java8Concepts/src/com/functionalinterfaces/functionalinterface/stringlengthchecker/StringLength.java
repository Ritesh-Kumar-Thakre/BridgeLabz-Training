package com.functionalinterfaces.functionalinterface.stringlengthchecker;

import java.util.function.Function;

public class StringLength {
	public static void main(String[] args) {
		int limit = 20;
		String str = "String Length";
		Function<String, Integer> check = x -> str.length();
		int length = check.apply(str);

		if (length > limit) {
			System.out.println("Limit exceeds");
		} else {
			System.out.println("Under limit");
		}
	}
}
