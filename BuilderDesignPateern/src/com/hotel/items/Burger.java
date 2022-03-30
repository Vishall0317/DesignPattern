package com.hotel.items;

import com.hotel.items.packer.Packing;
import com.hotel.items.packer.Wrapper;

public abstract class Burger implements Item {

	@Override
	public String name() {
		return "Burger";
	}

	@Override
	public Packing packing() {
		return new Wrapper();
	}

}
