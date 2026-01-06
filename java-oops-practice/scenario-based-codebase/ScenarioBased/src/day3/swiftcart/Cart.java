package day3.swiftcart;

import java.util.ArrayList;

public class Cart implements ICheckout{
	int totalItems;
	double totalPrice;
	ArrayList<Product> productsList = new ArrayList<>();
	
	public Cart(int totalItems, double totalPrice) {
		this.totalItems=totalItems;
		this.totalPrice=totalPrice;
	}

	public void addProduct(Product p) {
		productsList.add(p);
	}

	public void removeProduct(Product p) {
		productsList.remove(p);
	}

	public double generateBill() {
		totalPrice = 0;
		totalItems = 0;
		for (Product p : productsList) {
			totalPrice += p.price;
			totalItems++;
		}
		return totalPrice;
	}

	public double applyDiscount() {
		double bill = generateBill();
		if (bill > 10000 && bill < 50000) {
			bill *= 0.95;
		} else if (bill > 50000) {
			bill *= 0.90;
		}
		return bill;
	}
	

	public void displayProduct() {
		System.out.println("======= Bill =======");
		System.out.println("Total items: "+totalItems);
		System.out.println("Total Price: "+totalPrice);
		System.out.println("Discounted Price: "+applyDiscount());
	}

}