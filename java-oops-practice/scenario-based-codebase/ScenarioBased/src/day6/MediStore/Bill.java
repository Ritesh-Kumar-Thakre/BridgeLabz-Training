package day6.MediStore;

public class Bill {
	double price1;
	double price2;
	double price3;

	public Bill(double price1, double price2, double price3) {
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
	}

	public double finalBill(double price1, double price2, double price3) {
		return price1 + price2 + price3;
	}
	
	public void billDisplay() {
		System.out.println("\n---- Bill ----");
		System.out.println("Total Price: "+finalBill(price1, price2, price3));
	}

}
