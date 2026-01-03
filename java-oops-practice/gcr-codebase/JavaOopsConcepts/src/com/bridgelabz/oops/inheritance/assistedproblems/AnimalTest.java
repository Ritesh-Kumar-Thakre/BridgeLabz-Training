package com.bridgelabz.oops.inheritance.assistedproblems;

public class AnimalTest {
	public static void main(String[] args) {

		Animal a1 = new Dog("Sheru", 3);
		Animal a2 = new Cat("Kitty", 2);
		Animal a3 = new Bird("Mithu", 1);

		a1.showInfo();
		a1.makeSound();

		System.out.println();

		a2.showInfo();
		a2.makeSound();

		System.out.println();

		a3.showInfo();
		a3.makeSound();
	}
}
