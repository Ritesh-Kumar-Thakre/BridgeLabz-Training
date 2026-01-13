package day2.CallCenter;

public class Customer implements Comparable<Customer> {
	protected String name;
	protected int age;
	protected String number;
	protected int callCount;

	public Customer(String name, int age, String number, int callCount) {
		this.name = name;
		this.age = age;
		this.number = number;
		this.callCount = callCount;
	}

	public void displayCustomer() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Number: " + number);
	}

	@Override
	public int compareTo(Customer o) {
		return Integer.compare(this.callCount, o.callCount);
	}

	@Override
	public String toString() {
		return "Name: "+name + ", Number: " + number + ", Number of calls: " + callCount;
	}
}
