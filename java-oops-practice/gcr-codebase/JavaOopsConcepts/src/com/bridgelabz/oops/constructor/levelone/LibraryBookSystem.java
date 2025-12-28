package com.bridgelabz.oops.constructor.levelone;

public class LibraryBookSystem {
	String title;
	String author;
	double price;
	int availability;
	
	// constructor
	public LibraryBookSystem(String title,String author,double price,int availability) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.availability=availability;
	}
	
	// Method for borrow book
	public void borrowBook() {
		if (availability > 0) {
			availability--;
			System.out.println("Book issued successfully: " + title);
			System.out.println("Remaining copies: " + availability);
		} else {
			System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
		}
	}
	
	// Method for print
	public void print() {
		System.out.println("Book title is "+title);
		System.out.println("Author is "+author);
		System.out.println("Price is "+price);
		System.out.println("Currently availabile "+availability);
	}
}
