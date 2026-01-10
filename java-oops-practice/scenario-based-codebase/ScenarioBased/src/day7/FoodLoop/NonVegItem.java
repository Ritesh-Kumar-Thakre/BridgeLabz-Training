package day7.FoodLoop;

public class NonVegItem extends FoodItem {
	String meatType;

	public NonVegItem(String name, String category, double price, int availability, String meatType) {
		super(name, category, price, availability);
		this.meatType = meatType;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Meat Type: " + meatType);
	}

}
