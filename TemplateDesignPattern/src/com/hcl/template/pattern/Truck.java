package com.hcl.template.pattern;

public class Truck extends AbstractVehicle {

	@Override
	public void start() {
		System.out.println("Truck started");
	}

	@Override
	public void move(String from, String to) {

		System.out.println("moving from "+from+" to "+to);
		
	}

	@Override
	public void stop() {

		System.out.println("Truck stopped");
	}

}
