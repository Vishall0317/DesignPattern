package com.hotel.items;

import com.hotel.items.packer.Bottle;
import com.hotel.items.packer.Packing;

public abstract class ColdDrink implements Item{

	@Override
	public String name() {
		return "ColdDrink";
	}

	@Override
	public Packing packing() {
		return new Bottle();
	}

		

}
