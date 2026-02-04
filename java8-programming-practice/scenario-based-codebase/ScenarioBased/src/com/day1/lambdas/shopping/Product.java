package com.day1.lambdas.shopping;

public class Product {
	String name;
	double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " (Rs." + price + ")";
	}
}
