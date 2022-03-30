package com.hcl.template.pattern;

public class Client {

	public static void main(String[] args) {

		AbstractVehicle vehicle = new Car();

		vehicle.useVehicle("Chennai", "Bangalore");

		vehicle = new Truck();

		vehicle.useVehicle("Bangalore", "Delhi");
	}
}