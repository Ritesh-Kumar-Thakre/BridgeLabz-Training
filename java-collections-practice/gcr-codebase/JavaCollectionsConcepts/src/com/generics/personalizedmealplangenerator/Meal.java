package com.generics.personalizedmealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan> {
	private List<T> meal = new ArrayList<>();

	public void addMeal(T item) {
		meal.add(item);
	}

	public List<T> getMeal() {
		return meal;
	}
}
