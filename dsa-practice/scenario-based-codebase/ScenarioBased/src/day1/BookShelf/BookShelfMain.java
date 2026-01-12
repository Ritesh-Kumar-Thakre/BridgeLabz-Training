package day1.BookShelf;

import java.util.Scanner;

public class BookShelfMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		BookShelf shelf = new BookShelf();
		// Create books
		Book b1 = new Book("B101", "Java Basics", "James", "Programming");
		Book b2 = new Book("B102", "Data Structures", "Mark", "Programming");
		Book b3 = new Book("B103", "Harry Potter", "J.K.Rowling", "Fiction");
		Book b4 = new Book("B104", "Lord of Rings", "Tolkien", "Fiction");
		Book b5 = new Book("B105", "Physics", "H.C.Verma", "Science");
		// Add books to shelf
		shelf.addBook(b1);
		shelf.addBook(b2);
		shelf.addBook(b3);
		shelf.addBook(b4);
		shelf.addBook(b5);
		
		
		System.out.println("\nBorrow Book... Enter ID");
		String s1=sc.next();
		shelf.borrowBook(s1);
		
		System.out.println("\nReturning Book");
		shelf.returnBook(b2);
		
		System.out.println("\nBorrow Book... Enter ID");
		String s2=sc.next();
		shelf.borrowBook(s2);
		
		System.out.println("\nBorrowing B999 (not exists)");
		shelf.borrowBook("B999");
	}
}
