package com.generics.personalizedmealplangenerator;

public class VegetarianMeal implements MealPlan {
	protected String mealName;
	protected int calories;

	public VegetarianMeal(String mealName, int calories) {
		this.mealName = mealName;
		this.calories = calories;
	}

	@Override
	public String getMealName() {
		return mealName;
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return calories;
	}

}
