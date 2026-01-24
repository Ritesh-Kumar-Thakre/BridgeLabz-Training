package com.generics.multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
	private List<T> items = new ArrayList<>();

	public void addItem(T item) {
		items.add(item);
	}

	public List<T> getItems() {
		return items;
	}
}
