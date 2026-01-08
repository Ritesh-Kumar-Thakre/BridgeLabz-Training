package day4.PetPal;

public class Pet {
	String name;
	String type;
	int age;

	public Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	public void makeSound(String sound) {
		System.out.println("Sound: "+sound);
	}
		
	public void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("Type: "+type);
		System.out.println("Age: "+age);
	}
}
