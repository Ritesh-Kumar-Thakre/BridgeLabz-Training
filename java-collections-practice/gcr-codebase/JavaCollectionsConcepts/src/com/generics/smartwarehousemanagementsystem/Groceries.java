package com.generics.smartwarehousemanagementsystem;

import java.time.LocalDate;

public class Groceries extends WarehouseItem {
	protected LocalDate expiryDate;

	public Groceries(String name, int quantity, LocalDate expiryDate) {
		super(name, quantity);
		this.expiryDate = expiryDate;
	}

	@Override
	public void printItems() {
		System.out.println("\nName: " + name);
		System.out.println("Expiry Date: " + expiryDate);
	}
}
