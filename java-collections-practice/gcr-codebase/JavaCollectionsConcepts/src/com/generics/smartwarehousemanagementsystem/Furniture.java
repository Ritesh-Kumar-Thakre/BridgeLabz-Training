package com.generics.smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem {
	protected String material;

	public Furniture(String name, int quantity, String material) {
		super(name, quantity);
		this.material = material;
	}

	@Override
	public void printItems() {
		System.out.println("\nName: " + name);
		System.out.println("Material: " + material);
	}
}
