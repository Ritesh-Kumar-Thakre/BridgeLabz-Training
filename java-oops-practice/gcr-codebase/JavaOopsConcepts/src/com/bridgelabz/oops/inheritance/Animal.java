package com.bridgelabz.oops.inheritance;

public class Animal {

	protected String name;
	protected int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void makeSound() {
		System.out.println("Animal makes a sound");
	}

	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
