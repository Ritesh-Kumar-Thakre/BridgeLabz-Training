package com.lambdas.lambdaexpressions.customsortingecommerce;

public class Product {
	String name;
	double price;
	int discount;
	double rating;

	public Product(String name, double price, int discount, double rating) {
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Name: " + name + " | " + "Price: " + price + " | " + "Discount: " + discount + " | " + "Rating: "
				+ rating;
	}
}
