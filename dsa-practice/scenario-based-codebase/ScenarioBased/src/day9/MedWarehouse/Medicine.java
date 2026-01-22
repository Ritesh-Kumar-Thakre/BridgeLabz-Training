package day9.MedWarehouse;

import java.time.LocalDate;

public class Medicine {
	protected String name;
	protected int quantity;
	protected LocalDate manufacturingDate;
	protected LocalDate expiryDate;

	public Medicine(String name, int quantity, LocalDate manufacturingDate, LocalDate expiryDate) {
		this.name = name;
		this.quantity = quantity;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return name + " | Qty: " + quantity + " | Expiry: " + expiryDate;
	}
}
