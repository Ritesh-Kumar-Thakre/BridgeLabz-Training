package day4.PetPal;

public class Cat extends Pet implements IInteractable {
	String gender;
	String behavior;
	int hunger=0;
	int energy=0;

	public Cat(String name, String type, int age, String gender, String behavior,int hunger,int energy) {
		super(name, type, age);
		this.gender = gender;
		this.behavior = behavior;
		this.hunger=hunger;
		this.energy=energy;
	}
	
	@Override
	public void feed() {
		hunger++;
		energy++;
	}

	@Override
	public void play() {
		hunger--;
		energy--;
	}

	@Override
	public void sleep() {
		energy++;
		hunger--;
	}

	@Override
	public void printDetails() {
		System.out.println("\n----Pet Cat----");
		super.printDetails();
		System.out.println("Gender: " + gender);
		System.out.println("Behavior: " + behavior);
		System.out.println("Energy: "+energy+" % out of 10");
		System.out.println("Hunger: "+hunger+" % out of 10");
	}

}
