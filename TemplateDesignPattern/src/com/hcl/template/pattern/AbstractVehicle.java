package com.hcl.template.pattern;

public abstract class AbstractVehicle {

	public abstract void start();

	public abstract void move(String from, String to);

	public abstract void stop();

	public void useVehicle(String source, String destination) { //template method

		start();
		move(source, destination);
		stop();

	}

}
