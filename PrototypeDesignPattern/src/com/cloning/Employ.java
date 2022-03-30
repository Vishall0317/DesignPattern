package com.cloning;

public class Employ implements Cloneable{

	private int id;
	private String name;
	private double salary;

	public Employ(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employ getEmployObjectFromCloning() {
		Object obj = null;
		try {
			obj = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return (Employ) obj;
	}

	@Override
	public String toString() {
		return "Employ id=" + id + ", name=" + name + ", salary=" + salary;
	}

}
