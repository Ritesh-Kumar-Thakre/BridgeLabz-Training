package com.bridgelabz.oops.inheritance.singleinheritance;

public class Book {
	private String title;
	private int publicationYear;
	
	public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
	
	public String getTitle() {
		return title;
	}
 
	public int getPublicationYear() {
		return publicationYear; 
	}
}