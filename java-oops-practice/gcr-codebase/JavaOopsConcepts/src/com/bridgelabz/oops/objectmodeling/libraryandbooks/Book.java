package com.bridgelabz.oops.objectmodeling;

public class Book {
	public String title;
	public String author;
	
	public Book(String title, String author){
		this.title=title;
		this.author=author;
	}

	public void displayBook() {
		System.out.println("Book: "+title);
		System.out.println("Author: "+author);
	}
}