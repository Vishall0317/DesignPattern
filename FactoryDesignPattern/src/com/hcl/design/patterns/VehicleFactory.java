package com.hcl.design.patterns;

public class VehicleFactory {

	public static Vehicle getVehicle(VehicleTypeEnum vehicleType) { //factory method pattern

		if (vehicleType.equals(VehicleTypeEnum.BIKE)) {

			return new Bike();

		} else if (vehicleType.equals(VehicleTypeEnum.CAR)) {
			return new Car();
		} else if (vehicleType.equals(VehicleTypeEnum.TRUCK)) {
			return new Truck();
		}

		return null;

	}

}
