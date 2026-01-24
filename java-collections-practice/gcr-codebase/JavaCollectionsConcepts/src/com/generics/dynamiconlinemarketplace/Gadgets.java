package com.generics.dynamiconlinemarketplace;

public class Gadgets extends Product {
	protected String brand;

	public Gadgets(String name, double price, String category, String brand) {
		super(name, price, category);
		this.brand = brand;
	}

	@Override
	public void printProduct() {
		super.printProduct();
		System.out.println("Brand: " + brand);
	}

}
