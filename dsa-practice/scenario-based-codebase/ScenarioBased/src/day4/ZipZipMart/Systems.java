package day4.ZipZipMart;

import java.util.*;

public class Systems {
	ArrayList<Sales> sales = new ArrayList<>();

	public void mergeSort(ArrayList<Sales> sales, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		mergeSort(sales, si, mid);
		mergeSort(sales, mid + 1, ei);

		merge(sales, si, mid, ei);
	}

	public void merge(ArrayList<Sales> sales, int si, int mid, int ei) {
		ArrayList<Sales> temp = new ArrayList<>();
		int i = si;
		int j = mid + 1;

		while (i <= mid && j <= ei) {

			Sales left = sales.get(i);
			Sales right = sales.get(j);

			if (left.date.isBefore(right.date)
					|| (left.date.isEqual(right.date) && left.transactionAmount <= right.transactionAmount)) {
				temp.add(left);
				i++;

			} else {
				temp.add(right);
				j++;
			}
		}

		while (i <= mid) {
			temp.add(sales.get(i));
			i++;
		}
		while (j <= ei) {
			temp.add(sales.get(j));
			j++;
		}
		for (int k = 0; k < temp.size(); k++) {
			sales.set(si + k, temp.get(k));
		}
	}

	public void printRecord() {
		System.out.println("Daily Sales Records");
		for (int i = 0; i < sales.size(); i++) {
			System.out.println(sales.get(i).date + " " + sales.get(i).transactionAmount);
		}
	}
}
