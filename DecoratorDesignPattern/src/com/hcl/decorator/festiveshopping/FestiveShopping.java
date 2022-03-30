package com.hcl.decorator.festiveshopping;

import com.hcl.decorator.eshopping.EShoppingApp;

public abstract class FestiveShopping implements EShoppingApp {

	EShoppingApp eshoppingApp;

	public FestiveShopping(EShoppingApp eshoppingApp) {
		this.eshoppingApp = eshoppingApp;
	}

	@Override
	public double discount() {
		return 0;
	}

}
