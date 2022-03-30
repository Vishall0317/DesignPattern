package com.hotel.items;

public class Sprite extends ColdDrink {

	@Override
	public String name() {
		return super.name()+": Sprite";
	}
	
	@Override
	public float price() {
		return 25.00f;
	}

}
