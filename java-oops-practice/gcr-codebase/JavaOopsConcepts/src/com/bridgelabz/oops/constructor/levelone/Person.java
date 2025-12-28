package com.bridgelabz.oops.constructor.levelone;

public class Person {
	public static void main(String[] args) {
		PersonDetails p1=new PersonDetails("ritesh",21,"man");
		System.out.println("Original persion details");
		p1.printDetails();
		
		System.out.println("\nCloned persion details");
		PersonDetails p2=new PersonDetails(p1);
		p2.printDetails();
	}
}
