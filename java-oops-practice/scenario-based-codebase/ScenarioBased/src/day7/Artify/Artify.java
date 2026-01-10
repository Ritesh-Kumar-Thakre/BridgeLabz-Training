package day7.Artify;

public class Artify {
	public static void main(String[] args) {
		User u1 = new User("Ritesh", 4000);
		User u2 = new User("Ram", 5000);
		DigitalArt d1 = new DigitalArt("Avangers", "Stanly", 1000, "Commercial", 64, "pdf");
		PrintArt p1 = new PrintArt("MonaLisa", "john", 2000, "Personal", "Large", "A4");
		
		d1.display();
		d1.license();
		u1.printUser();
		d1.purchase(d1.price, u1.walletBalance);
		
		p1.display();
		p1.license();
		u2.printUser();
		p1.purchase(p1.price, u2.walletBalance);
	}
}
