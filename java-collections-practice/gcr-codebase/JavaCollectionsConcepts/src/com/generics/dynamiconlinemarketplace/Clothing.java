package com.generics.dynamiconlinemarketplace;

public class Clothing extends Product {
	protected String size;

	public Clothing(String name, double price, String category, String size) {
		super(name, price, category);
		this.size = size;
	}

	@Override
	public void printProduct() {
		super.printProduct();
		System.out.println("Size: " + size);
	}

}
//  java iosteam practice