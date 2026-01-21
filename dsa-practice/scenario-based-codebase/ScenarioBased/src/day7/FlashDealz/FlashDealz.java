package day7.FlashDealz;

public class FlashDealz {
	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 500000, 5);
		Product p2 = new Product("Mobile", 15000, 4);
		Product p3 = new Product("Tab", 25000, 9);
		Product p4 = new Product("Tv", 1000000, 10);
		Product p5 = new Product("Computer", 300000, 2);

		TopDiscounted topDiscounted = new TopDiscounted();
		topDiscounted.products.add(p1);
		topDiscounted.products.add(p2);
		topDiscounted.products.add(p3);
		topDiscounted.products.add(p4);
		topDiscounted.products.add(p5);

		topDiscounted.quickSort(topDiscounted.products, 0, topDiscounted.products.size() - 1);
		topDiscounted.printMainList();

	}
}
