package com.bridgelabz.oops.encapsulation.vehiclerental;

public class Bike extends Vehicle implements Insurable{
	
	private String policyNumber;
	
	public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
		super(vehicleNumber, "Bike", rentalRate);
		this.policyNumber = policyNumber;
	}
	
	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate()*days;
	}
	
	@Override
	public String getInsuranceDetails() {
		return "Policy: "+ policyNumber.substring(0,3) + "-------";
	}
	
	@Override 
	public double calculateInsurance(int days) {
		return (getRentalRate()*0.03)*days;
	}
}
