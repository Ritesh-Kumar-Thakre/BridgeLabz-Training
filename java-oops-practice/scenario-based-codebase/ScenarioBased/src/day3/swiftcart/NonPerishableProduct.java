package day3.swiftcart;

public class NonPerishableProduct extends Product{
	String warrantyPeriod, manufacturer;
	public NonPerishableProduct(String name, double price, String category,String warrantyPeriod,String manufacturer) {
		super(name, price, category);
		this.warrantyPeriod=warrantyPeriod;
		this.manufacturer=manufacturer;
	}
	
	@Override
	public void displayProduct() {
		super.displayProduct();
		System.out.println("Warranty Period: "+warrantyPeriod);
		System.out.println("Manufacturer: "+manufacturer);
		System.out.println();
	}
}
