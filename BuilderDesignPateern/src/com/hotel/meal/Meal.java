package com.hotel.meal;

import java.util.ArrayList;
import java.util.List;

import com.hotel.items.Item;

public class Meal {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getMealPrice() {
		float mealPrice = 0.0f;
		for (Item item : items) {
			mealPrice = mealPrice + item.price();
		}
		return mealPrice;
	}

	public void showItems() {

		items.forEach(item -> System.out
				.println(item.name() + " packed in: " + item.packing().pack() + " , price is: " + item.price()));

	}
}