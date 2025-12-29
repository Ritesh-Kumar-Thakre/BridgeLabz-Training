package com.bridgelabz.oops.constructor.levelone;

public class Student {
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
	
	// Access CGPA
	public double accesCGPA() {
		return cgpa;
	}
	
	// Modify CGPA
	public void modifyCGPA(double cgpa) {
		this.cgpa=cgpa;
	}
	
	public void displayDetails() {
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("Name        : " + name);
		System.out.println("CGPA        : " + cgpa);
	}
}
