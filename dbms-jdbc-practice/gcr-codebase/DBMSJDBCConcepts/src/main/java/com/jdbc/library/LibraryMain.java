package com.jdbc.library;

import java.util.Scanner;

public class LibraryMain {

	private static final Scanner scanner = new Scanner(System.in);
	private static final BookDAO bookDAO = new BookDAO();
	private static final BorrowDAO borrowDAO = new BorrowDAO();

	public static void main(String[] args) {

		while (true) {
			System.out.println("\n===== Library Management System =====");
			System.out.println("1. Search Book (Title + Author)");
			System.out.println("2. Search by Category");
			System.out.println("3. Borrow Book");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1: {
				System.out.print("Enter Title: ");
				String title = scanner.nextLine();
				System.out.print("Enter Author: ");
				String author = scanner.nextLine();
				bookDAO.searchByTitleAuthor(title, author).forEach(System.out::println);
				break;
			}
			case 2: {
				System.out.print("Enter Category: ");
				String category = scanner.nextLine();
				bookDAO.searchByCategory(category).forEach(System.out::println);
				break;
			}
			case 3: {
				System.out.print("Student ID: ");
				int sid = scanner.nextInt();
				System.out.print("Book ID: ");
				int bid = scanner.nextInt();
				borrowDAO.borrowBook(sid, bid);
				break;
			}
			case 4: {
				System.out.println("Exiting...");
				return;
			}
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
