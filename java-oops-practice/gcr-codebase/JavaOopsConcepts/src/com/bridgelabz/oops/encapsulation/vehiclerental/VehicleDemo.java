package com.bridgelabz.oops.encapsulation.vehiclerental;

import java.util.*;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Car("MP-20-BG-9090", 190, "PBB637398"));
		vehicles.add(new Bike("MP-04-JH-1881", 80, "HSKBS9090"));
		vehicles.add(new Truck("MP-32-AW-0137", 80, "LABUJ8292"));
		
		int rentalDays = 7;
        System.out.println("--- Rental & Insurance Invoice (" + rentalDays + " Days) ---");
        
        for(Vehicle vehicle: vehicles) {
        	vehicle.displayDetails();
        	
        	double rentalCost = vehicle.calculateRentalCost(rentalDays);
        	System.out.println("Rental Cost: " + rentalCost);
        	
        	if(vehicle instanceof Insurable) {
        		Insurable i = (Insurable) vehicle;
        		double insuranceCost = i.calculateInsurance(rentalDays);
                System.out.println("Insurance: " + insuranceCost + " , " + i.getInsuranceDetails() + "-----");
                System.out.println("Total: " + (rentalCost + insuranceCost));
                System.out.println();
        	}
        }
	}

}
