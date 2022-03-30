package com.hcl.decorator.eshopping;

import com.hcl.decorator.festiveshopping.BigBillionDayShopping;
import com.hcl.decorator.festiveshopping.WomensDayShopping;

public class Customer {

	public static void main(String[] args) {
		
		System.out.println("-----Normal days-------");
		EShoppingApp eshopping= new Flipkart();
		System.out.println("discount by Flipkart:" + eshopping.discount());
		
		eshopping=new Amazon();
		System.out.println("discount by Amazon:" + eshopping.discount());

		
		System.out.println("----BigBillionDay-----");
		
		EShoppingApp flipkart=new Flipkart();
		EShoppingApp amaz=new Amazon();
		
		eshopping=new BigBillionDayShopping(flipkart);

		System.out.println("Discount by Flipkart:"+eshopping.discount());
		eshopping=new BigBillionDayShopping(amaz);
		System.out.println("Discount by Amazon:" + eshopping.discount());
		
		System.out.println("-------WomensDay-----");
		
		EShoppingApp amazon=new Amazon();
		eshopping=new WomensDayShopping(amazon);
		System.out.println("Discount by Amazon:" + eshopping.discount());		
	}
}