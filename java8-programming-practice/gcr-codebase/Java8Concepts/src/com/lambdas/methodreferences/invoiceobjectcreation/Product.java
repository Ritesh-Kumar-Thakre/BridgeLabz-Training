package com.lambdas.methodreferences.invoiceobjectcreation;

import java.time.LocalTime;

public class Product {
	String name;
	double price;
	double rating;
	LocalTime time;

	public Product(String name, double price, double rating, LocalTime time) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Order Details:- \nName: " + name + "\nPrice: " + price + "\nRating: " + rating + "\nTime: " + time;
	}
}
