package com.bridgelabz.oops.constructor.levelone;

public class ProductInventoryApp {

	public static void main(String[] args) {
		Product p1=new Product("Mouse", 1530);
		Product p2=new Product("Laptop", 50250.53);
		Product p3=new Product("RAM", 2500);
		
		p1.displayProductDetails();
		p2.displayProductDetails();
		p3.displayProductDetails();
		
		Product.displayTotalProducts();
	}

}
