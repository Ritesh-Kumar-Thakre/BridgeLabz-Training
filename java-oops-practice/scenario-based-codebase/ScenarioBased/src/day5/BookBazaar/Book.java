package day5.BookBazaar;

public abstract class Book implements IDiscountable {

	protected String title;
	protected String author;
	protected double price;
	private int stock; // encapsulated

	protected Book(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}

	public boolean reduceStock(int qty) {
		if (qty <= stock) {
			stock -= qty;
			return true;
		}
		return false;
	}

	public int getStock() {
		return stock;
	}

	public double getPrice() {
		return price;
	}
}
