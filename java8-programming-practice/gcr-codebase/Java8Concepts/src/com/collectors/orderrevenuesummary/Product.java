package com.collectors.orderrevenuesummary;

public class Product {
	protected String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}
