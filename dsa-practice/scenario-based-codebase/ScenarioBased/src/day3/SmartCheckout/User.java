package day3.SmartCheckout;

import java.util.HashMap;
import java.util.Map;

public class User {
	protected String name;
	protected User next;

	HashMap<String, Integer> items = new HashMap<>();

	public User(String name) {
		this.name = name;
		this.next = null;
	}

	public void addItem(String itemName, int qty) {
		items.put(itemName, qty);
	}

	public void displayCart() {
		System.out.println("Customer: " + name);
		for (Map.Entry<String, Integer> e : items.entrySet()) {
			System.out.println("  " + e.getKey() + " x " + e.getValue());
		}
	}
}
