package day9.TailorShop;

import java.util.*;

public class Owner {
	ArrayList<Orders> orders = new ArrayList<>();

	public void insertionSort(ArrayList<Orders> orders) {
		for (int i = 1; i < orders.size(); i++) {
			Orders currentOrder = orders.get(i);
			int prev = i - 1;
			while (prev >= 0 && orders.get(prev).date.isAfter(currentOrder.date)) {
				orders.set(prev + 1, orders.get(prev));
				prev--;
			}
			orders.set(prev + 1, currentOrder);
		}
	}

	public void printOrders() {
		System.out.println("==== Orders ====");
		for (int i = 1; i < orders.size(); i++) {
			System.out.println("\nType: " + orders.get(i).type + "\nDate: " + orders.get(i).date);
		}
	}
}
