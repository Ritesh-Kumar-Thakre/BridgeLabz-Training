package com.bridgelabz.oops.constructor.levelone;

public class Book2 {
	public String ISBN;
	protected String title;
	private String author;
	
	public Book2(String ISBN,String title,String author) {
		this.ISBN=ISBN;
		this.title=title;
		this.author=author;
	}
	
	public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
	
	public void print () {
		System.out.println("ISBN = "+ISBN);
		System.out.println("title ="+title);
		System.out.println("author = "+author);
	}

}
