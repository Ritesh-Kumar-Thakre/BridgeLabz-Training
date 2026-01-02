package com.bridgelabz.oops.inheritance.singleinheritance;

public class Author extends Book{
	public String name;
	public String bio;
	
	public Author(String name,String bio,String title,int publicationYear) {
		super(title, publicationYear);
		this.name=name;
		this.bio=bio;
	}
	
	public void displayInfo() {
		System.out.println("Author Name: " + name);
	    System.out.println("Bio: " + bio);
	    System.out.println("Book Title: " + getTitle());
	    System.out.println("Publication Year: " + getPublicationYear());
	}
}
