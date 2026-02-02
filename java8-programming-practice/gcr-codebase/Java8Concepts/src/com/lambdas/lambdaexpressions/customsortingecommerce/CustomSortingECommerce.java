package com.lambdas.lambdaexpressions.customsortingecommerce;

import java.util.*;

public class CustomSortingECommerce {
	public static void main(String[] args) {
		Product p1 = new Product("Apple", 89, 5, 8.9);
		Product p2 = new Product("Banana", 54, 4, 8.7);
		Product p3 = new Product("Mango", 154, 2, 8.4);
		Product p4 = new Product("Orange", 40, 1, 6.5);
		Product p5 = new Product("Graps", 121, 3, 7.8);
		Product p6 = new Product("Watermelon", 79, 2, 8.8);
		Product p7 = new Product("Kiwi", 200, 3, 7.9);
		List<Product> productList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

		System.out.println("Price base sorting");
		Comparator<Product> compare1 = (a, b) -> Double.compare(a.price, b.price);
		productList.sort(compare1);
		for (Product p : productList) {
			System.out.println(p);
		}

		System.out.println("\nDiscount base sorting");
		Comparator<Product> compare2 = (a, b) -> Double.compare(a.discount, b.discount);
		productList.sort(compare2);
		for (Product p : productList) {
			System.out.println(p);
		}

		System.out.println("\nRating base sorting");
		Comparator<Product> compare3 = (a, b) -> Double.compare(a.rating, b.rating);
		productList.sort(compare3);
		for (Product p : productList) {
			System.out.println(p);
		}
	}
}
