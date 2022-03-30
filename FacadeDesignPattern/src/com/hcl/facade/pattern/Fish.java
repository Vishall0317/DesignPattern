package com.hcl.facade.pattern;

public class Fish implements Animal{
	public void eat() {
		System.out.println("Fish eats seafood");
	}
	public void move() {
		System.out.println("Fish swims");
	}
	public void sleep() {
		System.out.println("Fish sleep in water");
	}

}