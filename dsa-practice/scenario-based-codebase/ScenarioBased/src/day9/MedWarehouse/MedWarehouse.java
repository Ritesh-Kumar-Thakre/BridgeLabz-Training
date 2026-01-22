package day9.MedWarehouse;

import java.time.LocalDate;

public class MedWarehouse {
	public static void main(String[] args) {
		Branch b1 = new Branch();
		b1.medicines.add(new Medicine("Paracetamol", 50, LocalDate.of(2024, 1, 1), LocalDate.of(2025, 2, 10)));

		b1.medicines.add(new Medicine("Aspirin", 30, LocalDate.of(2024, 3, 1), LocalDate.of(2025, 3, 15)));

		Branch b2 = new Branch();
		b2.medicines.add(new Medicine("Cough Syrup", 20, LocalDate.of(2023, 6, 1), LocalDate.of(2024, 12, 20)));

		b2.medicines.add(new Medicine("Vitamin C", 40, LocalDate.of(2024, 5, 1), LocalDate.of(2025, 1, 25)));

		Warehouse warehouse = new Warehouse();
		warehouse.collectFromBranch(b1);
		warehouse.collectFromBranch(b2);

		warehouse.mergeSort(0, warehouse.allMedicines.size() - 1);
		warehouse.printAll();
		warehouse.checkExpiry();
	}
}
