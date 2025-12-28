package com.bridgelabz.oops.constructor.levelone;

public class PersonDetails {
	String name;
	int age;
	String gender;
	
	public PersonDetails(String name,int age, String gender) {
		this.name="ritesh";
		this.age=21;
		this.gender="man";
	}
	
	public PersonDetails(PersonDetails other){
		this.name=other.name;
		this.age=other.age;
		this.gender=other.gender;
	}
	
	public void printDetails() {
		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age);
		System.out.println("Gender : " + gender);
	}
}
