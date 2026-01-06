package day3.swiftcart;

public class Product {
	protected String name;
	protected  double price;
	protected String category;
	
	public Product(String name,double price, String category) {
		this.name=name;
		this.price=price;
		this.category=category;
	}
	
	public void displayProduct() {
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Category: "+category);
	}
}
