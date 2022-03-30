package com.hcl.decorator.festiveshopping;

import com.hcl.decorator.eshopping.EShoppingApp;

public class WomensDayShopping extends FestiveShopping {

	public WomensDayShopping(EShoppingApp eshoppingApp) {
		super(eshoppingApp);
	}

	@Override
	public double discount() {
		return eshoppingApp.discount() + 25.0;
	}

}
