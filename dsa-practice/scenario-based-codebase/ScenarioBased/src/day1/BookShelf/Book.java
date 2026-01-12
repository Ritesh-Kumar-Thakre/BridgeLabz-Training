package day1.BookShelf;

public class Book {
	private String titel;
	private String author;
	private String genre;
	private String bookId;

	public Book(String titel, String author, String genre, String bookId) {
		this.titel = titel;
		this.author = author;
		this.genre = genre;
		this.bookId = bookId;
	}

	public String getTitel() {
		return titel;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public String getBookId() {
		return bookId;
	}

	public void display() {
		System.out.println("Titel: " + titel);
		System.out.println("Author: " + author);
		System.out.println("Genre: " + genre);
	}
}