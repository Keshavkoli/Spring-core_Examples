package com.constructor.injection.with.dependent.object;

public class Employee {
	private int id;
	private String name;
	private Address address;// Aggregation

	public Employee() {
		System.out.println("define  construtor");
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void show() {
		System.out.println(id + " " + name);
		System.out.println(address.toString());
	}
}
