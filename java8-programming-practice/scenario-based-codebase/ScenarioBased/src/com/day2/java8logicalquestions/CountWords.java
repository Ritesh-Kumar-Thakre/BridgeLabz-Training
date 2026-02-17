package com.day2.java8logicalquestions;

import java.util.Scanner;
import java.util.Arrays;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String str = sc.nextLine();
		int count = (int) Arrays.stream(str.split(" ")).count();
		System.out.println(count);
		sc.close();
	}
}
