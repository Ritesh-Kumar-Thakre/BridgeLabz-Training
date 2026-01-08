package day4.PetPal;

public class PetPalApp {
	public static void main(String[] args) {
		Dog dog1=new Dog("Tommy","Jerman safart",15,"male","aggerasive",5,5);
		dog1.feed();
		dog1.play();
		dog1.sleep();
		dog1.printDetails();
		dog1.makeSound("bhow bhow bhow");
		
		Cat cat1=new Cat("kitty","Scottish Fold",10,"female","---",5,5);
		cat1.feed();
		cat1.play();
		cat1.sleep();
		cat1.printDetails();
		cat1.makeSound("mewow mewow mewow");
		
		Bird bird1=new Bird("fefe","greys",5,"female","---",5,5);
		bird1.feed();
		bird1.play();
		bird1.sleep();
		bird1.printDetails();
		bird1.makeSound("che che che");
		
		
	}
}
