package com.hcl.decorator.festiveshopping;

import com.hcl.decorator.eshopping.EShoppingApp;

public class BigBillionDayShopping extends FestiveShopping {

	public BigBillionDayShopping(EShoppingApp eshoppingApp) {
		super(eshoppingApp);
	}

	@Override
	public double discount() {
		return eshoppingApp.discount() + 20;
	}

}
