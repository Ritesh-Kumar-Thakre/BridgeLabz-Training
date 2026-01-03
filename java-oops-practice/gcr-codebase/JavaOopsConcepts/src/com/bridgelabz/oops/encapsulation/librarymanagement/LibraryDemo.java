package com.bridgelabz.oops.encapsulation.librarymanagement;

public class LibraryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LibraryItem[] inventory = {
		            new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
		            new Magazine("M042", "National Geographic", "Various"),
		            new DVD("D999", "Inception", "Christopher Nolan")
		        };

		        System.out.println("--- Library Inventory Report ---");
		        for (LibraryItem item : inventory) {
		            System.out.println(item.getItemDetails());
		            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
		            
		            if (item instanceof Reservable) {
		                ((Reservable) item).reserveItem("USER_123");
		            }
		            System.out.println("-----------------------------");
		        }

		        inventory[0].setBorrowerId("MEM_456");
		        System.out.println("Current Borrower for Item 1: " + inventory[0].getBorrowerId());
	}

}
