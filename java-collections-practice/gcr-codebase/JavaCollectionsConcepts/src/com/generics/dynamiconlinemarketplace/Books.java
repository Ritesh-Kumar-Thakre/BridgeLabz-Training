package com.generics.dynamiconlinemarketplace;

public class Books extends Product {
	protected int pages;

	public Books(String name, double price, String category, int pages) {
		super(name, price, category);
		this.pages = pages;
	}

	@Override
	public void printProduct() {
		super.printProduct();
		System.out.println("Pages: " + pages);
	}
}
