package com.bridgelabz.oops.constructor.levelone;

public class Product {
	String productName;
	double price;
	
	static int totalProducts;
	
	// Constructor
    public Product(String productName, double price) {
        this.productName =productName;
        this.price =price;
        totalProducts++; // increase count when a product is created
    }
    
    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name : "+productName);
        System.out.println("Price        : "+price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: "+totalProducts);
    }
}
