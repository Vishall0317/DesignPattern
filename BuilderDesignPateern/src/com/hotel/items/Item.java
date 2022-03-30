package com.hotel.items;

import com.hotel.items.packer.Packing;

public interface Item {

	public abstract String name();

	public abstract Packing packing();

	public abstract float price();

}
