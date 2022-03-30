package com.cloning;

public class CloneDemo {

	public static void main(String[] args) {

		Employ emp1 = new Employ(1001, "ravi", 45600.25);

		System.out.println(emp1);

		Employ receivedObject = emp1.getEmployObjectFromCloning();

		System.out.println(receivedObject);
		Employ receivedObject2 = emp1.getEmployObjectFromCloning();

		System.out.println(receivedObject2);

	}

}
