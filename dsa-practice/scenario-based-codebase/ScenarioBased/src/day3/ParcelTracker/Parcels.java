package day3.ParcelTracker;

public class Parcels {
	protected String name;
	protected double price;
	protected int quentity;
	protected String origin;

	public Parcels(String name, double price, int quentity, String origin) {
		this.name = name;
		this.price = price;
		this.quentity = quentity;
		this.origin = origin;
	}

	public void parcelDetails() {
		System.out.println("***Product Details***");
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Quentity: " + quentity);
		System.out.println("Origin: " + origin);
		System.out.println("Invoice.pdf");
	}
}
