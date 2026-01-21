package day7.FlashDealz;

import java.util.*;

public class TopDiscounted {
	ArrayList<Product> products = new ArrayList<>();

	public void quickSort(ArrayList<Product> products, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int pivoteIndex = pivote(products, si, ei);
		quickSort(products, si, pivoteIndex - 1);
		quickSort(products, pivoteIndex, ei);
	}

	public int pivote(ArrayList<Product> products, int si, int ei) {
		Product pivot = products.get(ei);
		int i = si - 1;

		for (int j = si; j < ei; j++) {
			if (products.get(j).discount >= pivot.discount) {
				i++;
				Product temp = products.get(j);
				products.set(j, products.get(i));
				products.set(i, temp);
			}
		}
		i++;
		Product temp = pivot;
		products.set(ei, products.get(i));
		products.set(i, temp);
		return i;

	}

	public void printMainList() {
		System.out.println("===== Top Discount List =====");
		for (int i = 0; i < products.size(); i++) {
			System.out.println("\nName: " + products.get(i).name + "\nPrice: " + products.get(i).price + "\nDiscount: "
					+ products.get(i).discount + "%");
			System.out.println();
		}
	}
}