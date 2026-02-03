package com.collectors.orderrevenuesummary;

import java.util.*;
import java.util.stream.Collectors;

public class Order {
	public static void main(String[] args) {
		Product p1 = new Product("Mango", 98);
		Product p2 = new Product("Banana", 26);
		Product p3 = new Product("Orange", 46);
		Product p4 = new Product("Kiwi", 180);
		Product p5 = new Product("Amrud", 59);
		Product p6 = new Product("Graps", 90);

		List<Product> productList = Arrays.asList(p1, p2, p3, p4, p5, p6);

		DoubleSummaryStatistics stats = productList.stream().collect(Collectors.summarizingDouble(Product::getPrice));
		
		System.out.println(stats);

	}
}
