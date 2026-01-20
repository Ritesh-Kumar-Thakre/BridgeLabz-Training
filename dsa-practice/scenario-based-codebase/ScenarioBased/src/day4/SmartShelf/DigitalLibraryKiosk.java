package day4.SmartShelf;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitalLibraryKiosk {

	ArrayList<String> books = new ArrayList<>();

	public void addBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book title");
		String title = sc.next();
		books.add(title);

		int i = books.size() - 1;
		while (i > 0 && books.get(i - 1).compareTo(books.get(i)) > 0) {
			String temp = books.get(i);
			books.set(i, books.get(i - 1));
			books.set(i - 1, temp);
			i--;
		}
	}

	public void printBooks() {
		System.out.println("Reading List");
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
	}
}
