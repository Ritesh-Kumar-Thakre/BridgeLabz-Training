package com.generics.smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem {
	protected String brand;

	public Electronics(String name, int quantity, String brand, int warranty) {
		super(name, quantity);
		this.brand = brand;
		this.warranty = warranty;
	}

	protected int warranty;

	@Override
	public void printItems() {
		System.out.println("\nName: " + name);
		System.out.println("Quantity: " + quantity);
		System.out.println("Brand: " + brand);
		System.out.println("Warranty: " + warranty);
	}

}
