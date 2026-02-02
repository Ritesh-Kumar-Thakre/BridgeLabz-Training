package com.lambdas.methodreferences.hospitalpatientidprinting;

public class Patient {
	String name;
	int age;
	int id;

	public Patient(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void printId() {
		System.out.println(id);
	}

}
