package day7.FoodLoop;

public class VegItem extends FoodItem {
	int spiceLevel;

	public VegItem(String name, String category, double price, int availability, int spiceLevel) {
		super(name, category, price, availability);
		this.spiceLevel = spiceLevel;
	}

	public boolean isJain() {
		return true;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Spice Level: " + spiceLevel);
	}

}
