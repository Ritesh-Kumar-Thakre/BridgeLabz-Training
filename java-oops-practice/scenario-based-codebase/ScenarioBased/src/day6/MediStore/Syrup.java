package day6.MediStore;

public class Syrup extends Medicine{
	int volume;
	String flavor;
	int need;
	
	public Syrup(String name, double price, int expiryDate, int quantity,int volume,String flavor,int need) {
		super(name, price, expiryDate, quantity, price);
		this.volume=volume;
		this.flavor=flavor;
		this.need=need;
	}
		
	@Override
	public void display() {
		System.out.println("\n2. Syrup");
		super.display();
		System.out.println("Volume: "+volume+"ml");
		System.out.println("Flavor: "+flavor);
	}
}
