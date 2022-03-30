package com.hotel.customer;

import java.util.List;

import com.hotel.meal.Meal;
import com.hotel.meal.MealBuilder;

public class Customer {

	public static void main(String[] args) {

		MealBuilder builder = new MealBuilder();

		Meal meal = builder.prepareVegMeal();

		meal.showItems();

		System.out.println("Meal cost is:" + meal.getMealPrice());
		
		
		List<Meal> mealList = builder.prepareVegNonVegMeal();
		
		for(Meal m:mealList) {
			
			m.showItems();
			System.out.println("Meal cost is:"+m.getMealPrice());
			System.out.println();
		}
		
		

	}
}
