package day3.campusconnect;

public class Person {
	protected String name;
	protected int id;
	protected String email;
	
	public Person(String name,int id,String email) {
		this.name=name;
		this.id=id;
		this.email=email;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Email: "+email);
	}
}
