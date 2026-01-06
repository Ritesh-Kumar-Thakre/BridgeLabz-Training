package day3.swiftcart;

public class SwiftCartApp {
	public static void main(String[] args) {
		PerishableProduct p1=new PerishableProduct("Milk", 200, "Dary Fresh", "22/07/2025", "Capt it in cold plce");
		PerishableProduct p2=new PerishableProduct("oil", 1000, "Soyabin Oil", "12/03/2026", "Capt it in plastic box");
		PerishableProduct p3=new PerishableProduct("dates", 1500, "Fresh Untouched", "02/01/2026", "You can use it while inside the packet");
		p1.displayProduct();
		p2.displayProduct();
		p3.displayProduct();
		
		NonPerishableProduct p4=new NonPerishableProduct("Watch", 3500,  "Electronics", "1 year Warranty", "Bolt");
		NonPerishableProduct p5=new NonPerishableProduct("TV", 100000,  "Electronics", "2 year Warranty", "Ultra");
		NonPerishableProduct p6=new NonPerishableProduct("Mobile", 150000,  "Electronics", "2 year Warranty", "Realme");
		p4.displayProduct();
		p5.displayProduct();
		p6.displayProduct();
		
		Cart c = new Cart(0, 0);
		c.addProduct(p1);
		c.addProduct(p2);
		c.addProduct(p3);
		c.addProduct(p4);
		c.addProduct(p5);
		c.addProduct(p6);
	
		c.generateBill();
		c.applyDiscount();
		
		c.displayProduct();
	}
}
