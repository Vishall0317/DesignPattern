package com.hotel.items;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return super.name()+": Pepsi";
	}
	
	@Override
	public float price() {
		return 20.00f;
	}

}
