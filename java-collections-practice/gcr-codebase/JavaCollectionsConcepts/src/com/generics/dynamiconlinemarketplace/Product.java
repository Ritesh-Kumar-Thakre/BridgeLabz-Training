package com.generics.dynamiconlinemarketplace;

public class Product {
	protected String name;
	protected double price;
	protected String category;

	public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public <T extends Product> void applyDiscount(T product, double percentage) {
		product.price -= product.price * percentage / 100;
	}

	public void printProduct() {
		System.out.println("\nName: " + name);
		System.out.println("Price: " + price);
		System.out.println("Category: " + category);
	}
}
