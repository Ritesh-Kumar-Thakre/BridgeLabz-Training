package com.bridgelabz.oops.constructor.levelone;

public class CarRental {
	String customerName;
	String carModel;
	String rentalDays;
	
	public CarRental(String customerName,String carModel,String rentalDays) {
		this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
	}
	
	public void print() {
		System.out.println("Customers name is "+customerName);
		System.out.println("Model is "+carModel);
		System.out.println("Day of rental is "+rentalDays);
	}
}
