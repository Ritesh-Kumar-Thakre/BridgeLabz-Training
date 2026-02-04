package com.day1.functionalinterfaces.comparator;

public class Product {
	String name;
	double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " Rs. " + price;
	}
}
