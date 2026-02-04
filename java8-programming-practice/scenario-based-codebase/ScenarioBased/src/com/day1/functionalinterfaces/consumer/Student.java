package com.day1.functionalinterfaces.consumer;

public class Student {
	String name;
	int rollNo;
	String whichClass;

	public Student(String name, int rollNo, String whichClass) {
		this.name = name;
		this.rollNo = rollNo;
		this.whichClass = whichClass;
	}

	@Override
	public String toString() {
		return "Name: " + name + " | Roll No: " + rollNo + " | Class: " + whichClass;
	}
}