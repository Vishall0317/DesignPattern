package com.hcl.facade.pattern;

public class AnimalVendor {

	public Animal getAnimal(String animalName) {

		if (animalName.equals("dog")) {
			Dog dog = new Dog();
			return dog;
		}
		if (animalName.equals("bird")) {
			Bird bird = new Bird();
			return bird;
		}

		if (animalName.equals("fish")) {
			Fish fish = new Fish();
			return fish;

		}

		return null;

	}

	/*
	 * public Bird getBird(String name) {
	 * 
	 * Bird b = new Bird(); b.eat(); b.move(); b.sleep();
	 * 
	 * return b; }
	 * 
	 * public Dog getDog(String name) {
	 * 
	 * Dog b = new Dog(); b.eat(); b.move(); b.sleep();
	 * 
	 * return b; }
	 */

}
