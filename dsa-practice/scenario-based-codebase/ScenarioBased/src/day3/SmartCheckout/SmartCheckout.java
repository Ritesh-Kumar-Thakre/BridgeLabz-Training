package day3.SmartCheckout;

import java.util.HashMap;

public class SmartCheckout {
	public static void main(String[] args) {

		HashMap<String, Item> inventory = new HashMap<>();
		inventory.put("Pen", new Item("Pen", 10, 20));
		inventory.put("Pencil", new Item("Pencil", 20, 10));
		inventory.put("Bottle", new Item("Bottle", 5, 900));
		inventory.put("Laptop", new Item("Laptop", 1, 500000));

		User u1 = new User("Ritesh");
		u1.addItem("Pen", 2);
		u1.addItem("Bottle", 1);
		u1.addItem("Laptop", 1);

		User u2 = new User("XYZ");
		u2.addItem("Pencil", 5);
		u2.addItem("Pen", 3);
		

		Counter counter = new Counter();
		counter.add(u1);
		counter.add(u2);

		counter.processNextCustomer(inventory);
		counter.processNextCustomer(inventory);
		counter.processNextCustomer(inventory);

		System.out.println("\nRemaining Inventory:");
		for (Item item : inventory.values()) {
			item.displayItem();
		}
	}
}
