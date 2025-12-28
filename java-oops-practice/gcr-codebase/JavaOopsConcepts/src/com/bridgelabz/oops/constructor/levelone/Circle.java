package com.bridgelabz.oops.constructor.levelone;

public class Circle {
	public static void main(String []args) {
		CircleRadius radius=new CircleRadius();
		radius.printRadius();
		
		System.out.println("\n");
		
		CircleRadius radius2=new CircleRadius(26);
		radius2.printRadius();
	}
}
