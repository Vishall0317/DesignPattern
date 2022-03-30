package com.hcl.facade.pattern;


public class Customer {

	
	public static void main(String[] args) {
		
		AnimalVendor vendor=new AnimalVendor();
		
		Animal fish = vendor.getAnimal("fish");
		
		fish.eat();
		fish.move();
		fish.sleep();
		
		Animal dog = vendor.getAnimal("dog");
		
		dog.eat();
		dog.move();
		dog.sleep();		
		
	}
}
