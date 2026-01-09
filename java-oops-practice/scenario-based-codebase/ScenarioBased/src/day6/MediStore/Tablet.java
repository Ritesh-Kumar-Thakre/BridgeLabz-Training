package day6.MediStore;

public class Tablet extends Medicine {
	int dosage;
	int tabletCount;
	int need;

	public Tablet(String name, double price, int expiryDate, int quantity, int dosage, int tabletCount,int need) {
		super(name, price, expiryDate, quantity, price);
		this.dosage = dosage;
		this.tabletCount = tabletCount;
		this.need=need;
	}

	@Override
	public void display() {
		System.out.println("\n1. Tablet");
		super.display();
		System.out.println("Dosage: " + dosage);
		System.out.println("Tablet Counts: " + tabletCount);
	}
}
