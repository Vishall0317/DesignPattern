package com.hotel.meal;

import java.util.ArrayList;
import java.util.List;

import com.hotel.items.ChickenBurger;
import com.hotel.items.Pepsi;
import com.hotel.items.Sprite;
import com.hotel.items.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Sprite());

		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		meal.addItem(new Sprite());
		return meal;
	}

	public List<Meal> prepareVegNonVegMeal() {

		List<Meal> combiMeal = new ArrayList<>();
		combiMeal.add(prepareVegMeal());
		combiMeal.add(prepareNonVegMeal());
		return combiMeal;
	}

}
