package com.generics.dynamiconlinemarketplace;

public class DynamicOnlineMarketPlace {

	public static void main(String[] args) {
		Books b1 = new Books("Java", 630, "Programming", 700);
		Books b2 = new Books("Python", 540, "Programming", 650);
		Clothing c1 = new Clothing("Wastern", 5000, "Party", "XL");
		Gadgets g1 = new Gadgets("Spider Web", 35740, "Game", "Marvel");
		b1.printProduct();
		b2.printProduct();
		c1.printProduct();
		g1.printProduct();
		b1.applyDiscount(b1, 10);
		b1.printProduct();
	}
}