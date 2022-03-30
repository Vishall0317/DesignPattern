package com.hcl.template.pattern;

public class Car extends AbstractVehicle {

	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void move(String from, String to) {

		System.out.println("moving from "+from+" to "+to);
		
	}

	@Override
	public void stop() {

		System.out.println("Car stopped");
	}

}
