package com.generics.personalizedmealplangenerator;

public class VeganMeal implements MealPlan {
	protected String mealName;
	protected int calories;

	public VeganMeal(String mealName, int calories) {
		this.mealName = mealName;
		this.calories = calories;
	}

	@Override
	public String getMealName() {
		// TODO Auto-generated method stub
		return mealName;
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return calories;
	}
}
