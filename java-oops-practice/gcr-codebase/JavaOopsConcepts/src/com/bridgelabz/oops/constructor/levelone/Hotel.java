package com.bridgelabz.oops.constructor.levelone;

public class Hotel {
	public static void main(String[] args) {
		HotelBooking booking = new HotelBooking();
		System.out.println("room one details");
		booking.printDetails();
		
		HotelBooking booking1= new HotelBooking("ram","general",6);
		System.out.println("\nroom two details");
		booking1.printDetails();
		
		HotelBooking booking3 = new HotelBooking(booking1);
		System.out.println("\nCopied room two details");
		booking3.printDetails();
	}

}
