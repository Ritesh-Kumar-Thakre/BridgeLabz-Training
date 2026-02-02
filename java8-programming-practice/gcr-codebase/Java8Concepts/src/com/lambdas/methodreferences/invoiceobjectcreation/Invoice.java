package com.lambdas.methodreferences.invoiceobjectcreation;

import java.time.LocalTime;

public class Invoice {
	public static void main(String[] args) {
		Product p1 = new Product("Tv", 152630, 8.9, LocalTime.now());
		Product p2 = new Product("Laptop", 500000, 9.1, LocalTime.now());
		Product p3 = new Product("Mobile", 15000, 7.9, LocalTime.now());
		
	}
}
