package com.bridgelabz.oops.constructor.levelone;

public class BookDetails {
	String title;
	String author;
	double price;
	
	//default constructor
	public BookDetails() {
		title="Working Man";
		author="Unkonwn";
		price=230.32;
	}
	
	//parameterized constructor
	public BookDetails(String title,String author,double price) {
		this.title =title;
		this.author=author;
		this.price=price;
	}
	
	// Method to print details
	public void printDetails() {
		System.out.println("Title : " + title);
		System.out.println("Author: " + author);
		System.out.println("Price : " + price);
	}
}
