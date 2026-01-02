package com.bridgelabz.oops.inheritance.assistedproblems;

public class Car extends Vehicle {
	public int seatCapacity;
	
	public Car(int maxSpeed, String fuelType,int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity=seatCapacity;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
        System.out.println("Type: Car");
        System.out.println("Seat Capacity: " + seatCapacity);
	}
}
