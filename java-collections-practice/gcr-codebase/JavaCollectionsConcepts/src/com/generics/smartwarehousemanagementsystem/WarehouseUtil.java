package com.generics.smartwarehousemanagementsystem;

import java.util.List;

public class WarehouseUtil {
	public static void displayAll(List<? extends WarehouseItem> items) {
		for (WarehouseItem item : items) {
			item.printItems();
		}
	}
}
