package day9.TailorShop;

import java.time.LocalDate;

public class TailorShop {
	public static void main(String[] args) {
		Orders o1 = new Orders("Hip-Hop type", LocalDate.parse("2025-01-12"));
		Orders o2 = new Orders("South-Indian type", LocalDate.parse("2025-01-09"));
		Orders o3 = new Orders("School uniform", LocalDate.parse("2025-01-10"));
		Orders o4 = new Orders("Blazer", LocalDate.parse("2025-01-17"));
		Orders o5 = new Orders("Long pants", LocalDate.parse("2025-01-22"));
		Orders o6 = new Orders("Short pants", LocalDate.parse("2025-01-11"));

		Owner owner = new Owner();
		owner.orders.add(o1);
		owner.orders.add(o2);
		owner.orders.add(o3);
		owner.orders.add(o4);
		owner.orders.add(o5);
		owner.orders.add(o6);

		owner.insertionSort(owner.orders);
		owner.printOrders();
	}
}
