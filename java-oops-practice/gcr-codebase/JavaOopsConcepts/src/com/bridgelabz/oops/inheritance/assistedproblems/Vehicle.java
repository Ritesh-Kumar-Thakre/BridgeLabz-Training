package com.bridgelabz.oops.inheritance.assistedproblems;

public class Vehicle {
	public int maxSpeed;
	public String fuelType;
	
	public Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed=maxSpeed;
		this.fuelType=fuelType;
	}
	
	public void displayInfo() {
		System.out.println("Max Speed: "+maxSpeed);
		System.out.println("Fule Type: "+fuelType);
	}
}
