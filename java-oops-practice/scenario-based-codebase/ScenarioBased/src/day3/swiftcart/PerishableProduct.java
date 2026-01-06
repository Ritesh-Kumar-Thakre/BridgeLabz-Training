package day3.swiftcart;

public class PerishableProduct extends Product {
	String expiryDate, storageInstructions;
	public PerishableProduct(String name, double price, String category,String expiryDate, String storageInstructions) {
		super(name, price, category);
		this.expiryDate=expiryDate;
		this.storageInstructions=storageInstructions;
	}
	
	@Override
	public void displayProduct() {
		super.displayProduct();
		System.out.println("Expiry Date: "+expiryDate);
		System.out.println("Instructions: "+storageInstructions);
		System.out.println();
	}

}
