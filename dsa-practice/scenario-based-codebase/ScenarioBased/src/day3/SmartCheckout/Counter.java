package day3.SmartCheckout;

import java.util.HashMap;
import java.util.Map;

public class Counter {
	private User head;
	private User tail;

	public boolean isEmpty() {
		return head == null;
	}

	public void add(User user) {
		if (head == null) {
			head = tail = user;
		} else {
			tail.next = user;
			tail = user;
		}
	}

	private void remove() {
		if (head == null)
			return;

		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}
	}

	public void processNextCustomer(HashMap<String, Item> inventory) {
		if (isEmpty()) {
			System.out.println("No customers in queue.");
			return;
		}

		User current = head;
		double bill = 0;

		System.out.println("\nProcessing payment for " + current.name);

		for (Map.Entry<String, Integer> entry : current.items.entrySet()) {
			Item storeItem = inventory.get(entry.getKey());

			if (storeItem == null) {
				System.out.println("Item not found: " + entry.getKey());
				return;
			}

			if (entry.getValue() > storeItem.quantity) {
				System.out.println("Not enough stock for " + entry.getKey());
				return;
			}
		}

		for (Map.Entry<String, Integer> entry : current.items.entrySet()) {
			Item storeItem = inventory.get(entry.getKey());
			int qty = entry.getValue();

			bill += qty * storeItem.price;
			storeItem.quantity -= qty;
		}

		System.out.println("Total Bill: ₹" + bill);
		System.out.println("Payment successful for " + current.name);

		remove();
	}
}
