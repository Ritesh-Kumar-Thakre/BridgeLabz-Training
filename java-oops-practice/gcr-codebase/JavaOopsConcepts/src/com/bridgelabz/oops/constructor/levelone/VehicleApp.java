package com.bridgelabz.oops.constructor.levelone;

public class VehicleApp {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Ritesh Thakre", "Car");
        Vehicle v2 = new Vehicle("Rahul Sharma", "Bike");

        System.out.println("Before Fee Update:\n");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println("\nUpdating Registration Fee...\n");
        Vehicle.updateRegistrationFee(3200.00);

        System.out.println("After Fee Update:\n");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
