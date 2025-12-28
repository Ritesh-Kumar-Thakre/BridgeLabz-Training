package com.bridgelabz.oops.constructor.levelone;

public class LibraryBook {
	public static void main(String[] args) {
		LibraryBookSystem system= new LibraryBookSystem("Stranger Things", "Ross Duffer", 543.34, 1);
		system.print();
		System.out.println("\n");
		
		// book borrow
		system.borrowBook();
		system.borrowBook();
	}
}
