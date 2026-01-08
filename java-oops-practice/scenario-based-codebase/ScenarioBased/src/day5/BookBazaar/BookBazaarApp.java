package day5.BookBazaar;

public class BookBazaarApp {

	public static void main(String[] args) {

		Book b1 = new PrintedBook("Clean Code", "Robert Martin", 600, 10);

		Book b2 = new EBook("Java in Depth", "James Gosling", 500);

		Order order = new Order("ORD101");

		order.addBook(b1, 2);
		order.addBook(b2, 1);

		order.displayOrder();
	}
}
