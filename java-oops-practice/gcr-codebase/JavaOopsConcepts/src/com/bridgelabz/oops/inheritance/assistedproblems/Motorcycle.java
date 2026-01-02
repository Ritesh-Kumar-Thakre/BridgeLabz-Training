package com.bridgelabz.oops.inheritance.assistedproblems;

public class Motorcycle extends Vehicle {
	private boolean hasDiscBrake;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasDiscBrake) {
        super(maxSpeed, fuelType);
        this.hasDiscBrake = hasDiscBrake;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle");
        System.out.println("Disc Brake: " + (hasDiscBrake ? "Yes" : "No"));
    }
}
