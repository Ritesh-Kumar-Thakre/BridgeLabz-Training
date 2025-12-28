package com.bridgelabz.oops.constructor.levelone;

public class Vehicle {

    String ownerName;  
    String vehicleType;  

    static double registrationFee = 2500.00; 

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : " + registrationFee);
    }

    // class method (static)
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
