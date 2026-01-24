package com.generics.personalizedmealplangenerator;

import java.util.*;

public class Wildcards {
	public static <T extends MealPlan> List<T> generateMealPlan(List<T> meals, int maxCalories) {

		List<T> personalizedPlan = new ArrayList<>();

		for (T meal : meals) {
			if (meal.getCalories() < maxCalories) {
				personalizedPlan.add(meal);
			}
		}
		return personalizedPlan;
	}
}