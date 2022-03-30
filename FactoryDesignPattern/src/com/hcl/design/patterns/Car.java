package com.hcl.design.patterns;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car started");

	}

	@Override
	public void travel(String from, String to) {
		System.out.println("Travelling from " + from + "  to " + to);
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
}
