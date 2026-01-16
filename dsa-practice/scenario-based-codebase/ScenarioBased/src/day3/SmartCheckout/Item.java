package day3.SmartCheckout;

public class Item {
	protected String name;
	protected int quantity;
	protected double price;

	public Item(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public void displayItem() {
		System.out.println(name + " | Price: " + price + " | Stock: " + quantity);
	}
}
