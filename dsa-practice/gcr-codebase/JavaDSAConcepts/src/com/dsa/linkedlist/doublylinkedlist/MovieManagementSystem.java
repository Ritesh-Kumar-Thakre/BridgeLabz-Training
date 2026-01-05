package com.dsa.linkedlist.doublylinkedlist;

import java.util.Scanner;

public class MovieManagementSystem {
	static Movie head = null;
	static Movie tail = null;

	// Add at beginning
	public static void addAtBeginning(String title, String director, int year, double rating) {
		Movie newNode = new Movie(title, director, year, rating);

		if (head == null) {
			head = tail = newNode;
			return;
		}

		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	// Add at end
	public static void addAtEnd(String title, String director, int year, double rating) {
		Movie newNode = new Movie(title, director, year, rating);

		if (head == null) {
			head = tail = newNode;
			return;
		}

		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	// Add at specific position
	public static void addAtPosition(String title, String director, int year, double rating, int pos) {

		if (pos == 1) {
			addAtBeginning(title, director, year, rating);
			return;
		}

		Movie newNode = new Movie(title, director, year, rating);
		Movie temp = head;

		for (int i = 1; i < pos - 1 && temp != null; i++)
			temp = temp.next;

		if (temp == null || temp.next == null) {
			addAtEnd(title, director, year, rating);
			return;
		}

		newNode.next = temp.next;
		temp.next.prev = newNode;

		temp.next = newNode;
		newNode.prev = temp;
	}

	// Delete movie by title
	public static void deleteMovie(String title) {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Movie temp = head;

		// delete head
		if (temp.title.equalsIgnoreCase(title)) {

			if (head == tail)
				head = tail = null;
			else {
				head = head.next;
				head.prev = null;
			}

			System.out.println("Movie deleted.");
			return;
		}

		while (temp != null && !temp.title.equalsIgnoreCase(title))
			temp = temp.next;

		if (temp == null) {
			System.out.println("Movie not found.");
			return;
		}

		if (temp == tail) {
			tail = tail.prev;
			tail.next = null;
		} else {
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
		}

		System.out.println("Movie deleted.");
	}

	// Update movie rating
	public static void updateRating(String title, double newRating) {
		Movie temp = head;

		while (temp != null) {

			if (temp.title.equalsIgnoreCase(title)) {
				temp.rating = newRating;
				System.out.println("Rating updated successfully.");
				return;
			}

			temp = temp.next;
		}

		System.out.println("Movie not found.");
	}

	// Search by Director
	public static void searchByDirector(String director) {
		Movie temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.director.equalsIgnoreCase(director)) {
				printMovie(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found)
			System.out.println("No movies found for this director.");
	}

	// Search by Rating
	public static void searchByRating(double rating) {
		Movie temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.rating == rating) {
				printMovie(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found)
			System.out.println("No movies found with this rating.");
	}

	// Display forward
	public static void displayForward() {
		if (head == null) {
			System.out.println("No movies to display.");
			return;
		}

		Movie temp = head;
		System.out.println("\n--- Movies (Forward Order) ---");

		while (temp != null) {
			printMovie(temp);
			temp = temp.next;
		}
	}

	// Display reverse
	public static void displayReverse() {
		if (tail == null) {
			System.out.println("No movies to display.");
			return;
		}

		Movie temp = tail;
		System.out.println("\n--- Movies (Reverse Order) ---");

		while (temp != null) {
			printMovie(temp);
			temp = temp.prev;
		}
	}

	static void printMovie(Movie m) {
		System.out.println(
				"Title: " + m.title + ", Director: " + m.director + ", Year: " + m.year + ", Rating: " + m.rating);
	}

	// Main Menu
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n===== Movie Management Menu =====");
			System.out.println("1. Add Movie (Beginning)");
			System.out.println("2. Add Movie (End)");
			System.out.println("3. Add Movie (At Position)");
			System.out.println("4. Delete Movie by Title");
			System.out.println("5. Search by Director");
			System.out.println("6. Search by Rating");
			System.out.println("7. Update Movie Rating");
			System.out.println("8. Display Movies Forward");
			System.out.println("9. Display Movies Reverse");
			System.out.println("10. Exit");
			System.out.print("Enter choice: ");

			int ch = sc.nextInt();

			switch (ch) {

			case 1:
			case 2:
			case 3:
				System.out.print("\nEnter Movie Title, Director, Year and Rating: ");
				String title = sc.next();
				String director = sc.next();
				int year = sc.nextInt();
				double rating = sc.nextDouble();

				if (ch == 1)
					addAtBeginning(title, director, year, rating);
				else if (ch == 2)
					addAtEnd(title, director, year, rating);
				else {
					System.out.print("Enter position: ");
					int pos = sc.nextInt();
					addAtPosition(title, director, year, rating, pos);
				}
				break;

			case 4:
				System.out.print("Enter Title to delete: ");
				deleteMovie(sc.next());
				break;

			case 5:
				System.out.print("Enter Director name: ");
				searchByDirector(sc.next());
				break;

			case 6:
				System.out.print("Enter Rating to search: ");
				searchByRating(sc.nextDouble());
				break;

			case 7:
				System.out.print("Enter Movie Title to update rating: ");
				String t = sc.next();
				System.out.print("Enter new rating: ");
				updateRating(t, sc.nextDouble());
				break;

			case 8:
				displayForward();
				break;

			case 9:
				displayReverse();
				break;

			case 10:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}

}
