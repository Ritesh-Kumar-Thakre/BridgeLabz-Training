package com.bridgelabz.oops.constructor.levelone;

public class HotelBooking {
	String guestName;
	String roomType;
	int nights;
	
	public HotelBooking() {
		guestName="Ritesh";
		roomType="AC";
		nights=5;
	}
	
	public HotelBooking(String guestName,String roomType,int nights) {
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	
	public HotelBooking(HotelBooking other) {
		this.guestName=other.guestName;
		this.roomType=other.roomType;
		this.nights=other.nights;
	}
	
	public void printDetails() {
        System.out.println("Title : " + guestName);
        System.out.println("Author: " + roomType);
        System.out.println("Price : " + nights);
    }
}
