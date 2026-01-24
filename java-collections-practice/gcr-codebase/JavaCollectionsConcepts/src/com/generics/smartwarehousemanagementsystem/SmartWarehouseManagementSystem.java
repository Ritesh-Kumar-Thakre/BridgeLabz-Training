package com.generics.smartwarehousemanagementsystem;

import java.time.LocalDate;

public class SmartWarehouseManagementSystem {
	public static void main(String[] args) {
		Storage<Electronics> eStorage = new Storage<Electronics>();
		Electronics e1 = new Electronics("Tv", 4, "Apple", 3);
		Electronics e2 = new Electronics("Laptop", 8, "MSI", 1);
		eStorage.addItem(e1);
		eStorage.addItem(e2);

		Storage<Groceries> gStorage = new Storage<Groceries>();
		Groceries g1 = new Groceries("Olive Oil", 5, LocalDate.parse("2025-02-25"));
		Groceries g2 = new Groceries("Tomato sauce", 9, LocalDate.parse("2025-02-11"));
		gStorage.addItem(g1);
		gStorage.addItem(g2);

		Storage<Furniture> fStorage = new Storage<Furniture>();
		Furniture f1 = new Furniture("Sofa", 2, "Wood");
		Furniture f2 = new Furniture("Chare", 17, "Plastic");
		fStorage.addItem(f1);
		fStorage.addItem(f2);

		System.out.println("==== Electronic Items ====");
		WarehouseUtil.displayAll(eStorage.getItems());
		System.out.println("\n==== Grocerie Items ====");
		WarehouseUtil.displayAll(gStorage.getItems());
		System.out.println("\n==== Furnitures ====");
		WarehouseUtil.displayAll(fStorage.getItems());

	}
}
