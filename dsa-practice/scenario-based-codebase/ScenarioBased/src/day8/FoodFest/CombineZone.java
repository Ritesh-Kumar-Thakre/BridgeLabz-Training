package day8.FoodFest;

import java.util.*;

public class CombineZone {
	ArrayList<Zones> mainList = new ArrayList<>();

	public void mergeSort(ArrayList<Zones> mainList, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		mergeSort(mainList, si, mid);
		mergeSort(mainList, mid + 1, ei);

		merge(mainList, si, mid, ei);
	}

	public void merge(ArrayList<Zones> mainList, int si, int mid, int ei) {
		ArrayList<Zones> temp = new ArrayList<>();
		if (si >= ei) {
			return;
		}

		int i = si;
		int j = mid + 1;

		while (i <= mid && j <= ei) {
			if (mainList.get(i).zone.get(0).footfall < mainList.get(j).zone.get(0).footfall) {
				temp.add(mainList.get(i));
				i++;
			} else {
				temp.add(mainList.get(j));
				j++;
			}
		}
		while (i <= mid) {
			temp.add(mainList.get(i++));
		}

		while (j <= ei) {
			temp.add(mainList.get(j++));
		}
//		for (k = 0, i = si; k < temp.size(); k++, i++) {
//			mainList.set(i, temp.get(k));
//		}
		for (int a = 0; a < temp.size(); a++) {
			mainList.set(si + a, temp.get(a));
		}
	}

	public void printMainList() {
		System.out.println("==== Main List ====");
		for (Zones z : mainList) {
			for (Stall s : z.zone) {
				System.out.println("Stall name: " + s.name + "\nFootFall: " + s.footfall);
			}
		}

	}
}