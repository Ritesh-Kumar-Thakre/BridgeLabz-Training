package day5.BookBazaar;

public class EBook extends Book {

	public EBook(String title, String author, double price) {
		super(title, author, price, Integer.MAX_VALUE);
	}

	@Override
	public double applyDiscount() {
		return price * 0.85; // 15% off
	}
}
