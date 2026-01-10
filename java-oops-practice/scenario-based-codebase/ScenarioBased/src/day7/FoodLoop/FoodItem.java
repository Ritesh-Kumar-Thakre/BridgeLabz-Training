package day7.FoodLoop;

public class FoodItem {
	protected String name;
	protected String category;
	protected double price;
	protected int availability;

	public FoodItem(String name, String category, double price, int availability) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.availability = availability;
	}

	public void display() {
		System.out.println("\nName: " + name);
		System.out.println("Category: " + category);
		System.out.println("Price: " + price);
		System.out.println("Availability: " + availability);
	}
}
