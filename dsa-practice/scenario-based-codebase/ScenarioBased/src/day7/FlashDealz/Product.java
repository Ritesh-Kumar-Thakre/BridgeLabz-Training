package day7.FlashDealz;

public class Product {
	protected String name;
	protected double price;
	protected int discount;

	public Product(String name, double price, int discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
}