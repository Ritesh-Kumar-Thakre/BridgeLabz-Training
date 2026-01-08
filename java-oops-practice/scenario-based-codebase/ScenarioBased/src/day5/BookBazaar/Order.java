package day5.BookBazaar;

import java.util.*;

public class Order {

	private String orderId;
	private String status;
	private Map<Book, Integer> items = new HashMap<>();

	public Order(String orderId) {
		this.orderId = orderId;
		this.status = "CREATED";
	}

	public void addBook(Book book, int qty) {
		if (book.reduceStock(qty)) {
			items.put(book, qty);
		}
	}

	public double calculateTotal() {
		double total = 0;
		for (Map.Entry<Book, Integer> entry : items.entrySet()) {
			total += entry.getKey().applyDiscount() * entry.getValue();
		}
		return total;
	}

	void updateStatus(String status) {
		this.status = status;
	}

	public void displayOrder() {
		System.out.println("Order ID: " + orderId);
		System.out.println("Status: " + status);
		System.out.println("Total Amount: ₹" + calculateTotal());
	}
}
