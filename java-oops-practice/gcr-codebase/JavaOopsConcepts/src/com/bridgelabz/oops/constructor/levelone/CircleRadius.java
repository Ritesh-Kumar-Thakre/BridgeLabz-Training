package com.bridgelabz.oops.constructor.levelone;

public class CircleRadius {
	int radius;
	
	public CircleRadius() {
		this(24);// calling parameterized 
	}
	
	public CircleRadius(int radius){
		this.radius=radius;
	}
	
	public void printRadius() {
        System.out.println("Radius: " + radius);
    }
}
