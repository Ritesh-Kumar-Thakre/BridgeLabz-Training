package com.bridgelabz.oops.objectmodeling;
import java.util.*;

public class Library {

	public ArrayList<Book> books;
	
	public Library() {
		this.books=new ArrayList<>();
	}

	public void showBooks() {
		if(books.isEmpty()) {
			System.out.println("Sorry, We Currently have no Books");
		}
		else {
			for(Book b: books) {
				b.displayBook();
			}
		}
	}
	
	public void addBook(Book b) {
		books.add(b);
	}
}
