package day9.MedWarehouse;

import java.time.LocalDate;
import java.util.ArrayList;

public class Warehouse {

	ArrayList<Medicine> allMedicines = new ArrayList<>();

	public void collectFromBranch(Branch branch) {
		allMedicines.addAll(branch.medicines);
	}

	public void mergeSort(int si, int ei) {
		if (si >= ei)
			return;

		int mid = si + (ei - si) / 2;
		mergeSort(si, mid);
		mergeSort(mid + 1, ei);
		merge(si, mid, ei);
	}

	private void merge(int si, int mid, int ei) {
		ArrayList<Medicine> temp = new ArrayList<>();

		int i = si;
		int j = mid + 1;

		while (i <= mid && j <= ei) {
			if (allMedicines.get(i).expiryDate.isBefore(allMedicines.get(j).expiryDate)) {
				temp.add(allMedicines.get(i++));
			} else {
				temp.add(allMedicines.get(j++));
			}
		}

		while (i <= mid)
			temp.add(allMedicines.get(i++));
		while (j <= ei)
			temp.add(allMedicines.get(j++));

		for (int k = 0; k < temp.size(); k++) {
			allMedicines.set(si + k, temp.get(k));
		}
	}

	public void checkExpiry() {
		LocalDate today = LocalDate.now();

		System.out.println("\nEXPIRED MEDICINES");
		for (Medicine m : allMedicines) {
			if (m.expiryDate.isBefore(today)) {
				System.out.println(m);
			}
		}

		System.out.println("\nEXPIRING WITHIN 30 DAYS");
		for (Medicine m : allMedicines) {
			if (!m.expiryDate.isBefore(today) && m.expiryDate.isBefore(today.plusDays(30))) {
				System.out.println(m);
			}
		}
	}

	public void printAll() {
		System.out.println("\nSORTED MEDICINES");
		for (Medicine m : allMedicines) {
			System.out.println(m);
		}
	}
}
