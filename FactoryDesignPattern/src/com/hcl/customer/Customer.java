package com.hcl.customer;

import com.hcl.design.patterns.Vehicle;
import com.hcl.design.patterns.VehicleFactory;
import com.hcl.design.patterns.VehicleTypeEnum;

public class Customer {

	public static void main(String[] args) {

		Vehicle vehicle = VehicleFactory.getVehicle(VehicleTypeEnum.BIKE);

		vehicle.start();
		vehicle.travel("Hyderabad", "Bangalore");
		vehicle.stop();

		Vehicle vehicle2 = VehicleFactory.getVehicle(VehicleTypeEnum.TRUCK);

		vehicle2.start();
		vehicle2.travel("Banaglore", "Mumbai");
		vehicle2.stop();

		Vehicle vehicle3 = VehicleFactory.getVehicle(VehicleTypeEnum.CAR);

		vehicle3.start();
		vehicle3.travel("Mumbai", "Kolkatta");
		vehicle3.stop();

	}

}
