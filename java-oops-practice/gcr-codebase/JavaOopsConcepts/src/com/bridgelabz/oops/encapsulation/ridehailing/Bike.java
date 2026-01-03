package com.bridgelabz.oops.encapsulation.ridehailing;

public class Bike extends Vehicle{
	public Bike(String id, String driver) {
        super(id, driver, 5.0); 
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }
}
