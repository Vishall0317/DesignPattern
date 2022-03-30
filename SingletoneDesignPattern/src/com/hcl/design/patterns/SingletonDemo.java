
//program demonstrates Lazy instantiation of singleton instance

package com.hcl.design.patterns;

import java.time.LocalDate;

class Cart {

	private static Cart cartObj;

	private Cart() {

		System.out.println("Cart constructor invoked.");
	}

	public static Cart getCartObject() { //Lazy instantiation

		if (cartObj == null) {
			cartObj = new Cart();
		}

		return cartObj;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {

		Cart cart1 = Cart.getCartObject();

		Cart cart2 = Cart.getCartObject();

		Cart cart3 = Cart.getCartObject();

		System.out.println(cart1.hashCode());
		System.out.println(cart2.hashCode());
		System.out.println(cart3.hashCode());
		
		
		//LocalDate localDate=new LocalDate();
		
		LocalDate localDate1=LocalDate.now();
		LocalDate localDate2=LocalDate.now();		
		LocalDate localDate3=LocalDate.now();		
		
		System.out.println("Today date is:"+localDate1);
		System.out.println("localDate1 hashCode:"+localDate1.hashCode());
		
		System.out.println("localDate2 hashCode:"+localDate2.hashCode());
		System.out.println("localDate3 hashCode:"+localDate3.hashCode());
		
	}

}
