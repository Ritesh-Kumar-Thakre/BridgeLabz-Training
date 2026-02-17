package com.day2.java8logicalquestions;

import java.util.*;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		int count = (int) str.chars().map(c -> (char) c).filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o'
				|| c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U').count();
		System.out.println(count);
		sc.close();
	}
}
