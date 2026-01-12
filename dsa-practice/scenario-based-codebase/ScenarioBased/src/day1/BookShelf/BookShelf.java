package day1.BookShelf;

import java.util.*;

public class BookShelf {
	HashMap<String, LinkedList<Book>> genraMap=new HashMap<>();

	public void addBook(Book book) {
		String genra = book.getGenre();

		if (!genraMap.containsKey(genra)) {
			genraMap.put(genra, new LinkedList<>());
		}

		LinkedList<Book> bookList = genraMap.get(genra);

		for (Book b : bookList) {
			if (b.getBookId().equals(book.getBookId())) {
				System.out.println("Book already exists: " + book.getTitel());
				return;
			}
		}
		bookList.add(book);

		System.out.println("Book added: " + book.getTitel() + " (" + book.getGenre() + ")");

	}

	public void removeBook(String bookId) {

		boolean found = false;

		for (String genre : genraMap.keySet()) {
			LinkedList<Book> bookList = genraMap.get(genre);

			Iterator<Book> it = bookList.iterator();

			while (it.hasNext()) {
				Book b = it.next();

				if (b.getBookId().equals(bookId)) {
					it.remove(); // safely removes from LinkedList
					System.out.println("Book removed: " + b.getTitel());
					found = true;
					break;
				}
			}

			// If that genre has no books left, remove the genre entry
			if (bookList.isEmpty()) {
				genraMap.remove(genre);
			}

			if (found)
				break;
		}

		if (!found) {
			System.out.println("Book not found!");
		}
	}

	public void borrowBook(String bookId) {
		boolean found = false;

		for (String genre : genraMap.keySet()) {
			LinkedList<Book> bookList = genraMap.get(genre);

			Iterator<Book> it = bookList.iterator();

			while (it.hasNext()) {
				Book b = it.next();

				if (b.getBookId().equals(bookId)) {
					it.remove(); // remove from LinkedList
					System.out.println("Book borrowed: " + b.getTitel());
					found = true;
					break;
				}
			}

			// if that genre shelf is now empty → remove it
			if (bookList.isEmpty()) {
				genraMap.remove(genre);
			}

			if (found)
				break;
		}

		if (!found) {
			System.out.println("Book not available for borrowing.");
		}
	}

	public void returnBook(Book book) {
		String genre = book.getGenre();

		if (!genraMap.containsKey(genre)) {
			genraMap.put(genre, new LinkedList<>());
		}

		genraMap.get(genre).add(book);

		System.out.println("Book returned: " + book.getTitel());
	}
}
