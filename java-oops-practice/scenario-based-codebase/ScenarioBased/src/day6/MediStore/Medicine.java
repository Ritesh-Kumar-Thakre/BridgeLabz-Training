package day6.MediStore;

public class Medicine implements ISellable {
	String name;
	double price;
	int expiryDate;
	int quantity;
	double total;

	public Medicine(String name, double price, int expiryDate, int quantity, double total) {
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
		this.total = total;
	}

	public double totalprice(double price, int need) {
		total = need * price;
		return total;
	}

	public double discount(double discount) {
		double finalPrice = (total / discount);
		return finalPrice;
	}

	public void stockAdjustments(int quantity) {
		int low = quantity % 10;
		if (quantity <= low) {
			System.out.println("Stock is low need to refill");
		} else
			System.out.println("Sufficent Stock");
	}

	@Override
	public boolean sell(int quantity, int need) {
		if (quantity >= need) {
			quantity -= need;
			return true;
		}
		return false;
	}

	@Override
	public void checkExpiry(int date, int expiryDate) {
		if (expiryDate <= date) {
			System.out.println("Expired");
			return;
		} else
			System.out.println("Not expired");
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Expiry Date: " + expiryDate);
		System.out.println("Quantity: " + quantity);
	}
}
