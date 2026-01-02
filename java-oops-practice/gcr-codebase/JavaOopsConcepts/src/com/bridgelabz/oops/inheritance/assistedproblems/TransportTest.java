package com.bridgelabz.oops.inheritance.assistedproblems;

public class TransportTest {
	public static void main(String[] args) {

        Vehicle v1 = new Car(180, "Petrol", 5);
        Vehicle v2 = new Truck(120, "Diesel", 15);
        Vehicle v3 = new Motorcycle(140, "Petrol", true);

        Vehicle[] vehicles = { v1, v2, v3 };

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
