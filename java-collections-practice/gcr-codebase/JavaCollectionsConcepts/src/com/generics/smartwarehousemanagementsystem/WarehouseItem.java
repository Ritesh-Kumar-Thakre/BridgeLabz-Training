package com.generics.smartwarehousemanagementsystem;

public abstract class WarehouseItem {
	protected String name;
	protected int quantity;

	public WarehouseItem(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	abstract public void printItems();
}
