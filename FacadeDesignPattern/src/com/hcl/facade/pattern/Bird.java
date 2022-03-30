package com.hcl.facade.pattern;

public class Bird implements Animal{
	public void eat() {
		System.out.println("Bird eats nuts");
	}
	public void move() {
		System.out.println("Bird fly in sky");
	}
	public void sleep() {
		System.out.println("bird sleep in nest");
	}

}