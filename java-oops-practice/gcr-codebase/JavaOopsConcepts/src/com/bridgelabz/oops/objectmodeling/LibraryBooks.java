package com.bridgelabz.oops.objectmodeling;
public class LibraryBooks {

	public static void main(String[] args) {
		Book b1=new Book("GOT","RR Martin");
		Book b2= new Book("Avangers","Stanly");
		Book b3 = new Book("Java","Mark");
		
		Library l1=new Library();
		Library l2 = new Library();
		Library l3 = new Library();
		
		l1.addBook(b1);
		l2.addBook(b2);
		l3.addBook(b3);
		
		l1.showBooks();
		l2.showBooks();
		l3.showBooks();
	}

}
