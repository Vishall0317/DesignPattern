package com.hcl.decorator.eshopping;

public class Amazon implements EShoppingApp {

	@Override
	public double discount() {
		return 20.0;
	}

}
