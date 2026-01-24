package com.generics.personalizedmealplangenerator;

import java.util.List;

public class PersonalizedMealPlanGenerator {
	public static void main(String[] args) {
		Meal<VegetarianMeal> vegMeals = new Meal<>();
		vegMeals.addMeal(new VegetarianMeal("Paneer Bowl", 450));
		vegMeals.addMeal(new VegetarianMeal("Veg Salad", 300));
		vegMeals.addMeal(new VegetarianMeal("Butter Naan", 700));

		Meal<VeganMeal> veganMeals = new Meal<>();
		veganMeals.addMeal(new VeganMeal("Vegan Smoothie", 250));
		veganMeals.addMeal(new VeganMeal("Tofu Stir Fry", 500));

		List<VegetarianMeal> vegPlan = Wildcards.generateMealPlan(vegMeals.getMeal(), 500);

		List<VeganMeal> veganPlan = Wildcards.generateMealPlan(veganMeals.getMeal(), 300);

		System.out.println("Vegetarian Meal Plan:");
		for (VegetarianMeal meal : vegPlan) {
			System.out.println(meal.getMealName() + " - " + meal.getCalories());
		}

		System.out.println("\nVegan Meal Plan:");
		for (VeganMeal meal : veganPlan) {
			System.out.println(meal.getMealName() + " - " + meal.getCalories());
		}
	}
}
