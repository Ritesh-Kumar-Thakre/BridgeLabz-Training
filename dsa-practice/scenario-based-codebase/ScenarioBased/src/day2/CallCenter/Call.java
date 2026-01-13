package day2.CallCenter;

import java.util.*;

public class Call {
	Queue<Customer> normalCustomer = new LinkedList<>();
	PriorityQueue<Customer> vipCustomer = new PriorityQueue<>();
	HashMap<String, Integer> record = new HashMap<>();

	public boolean call(String number) {
		return true;
	}

	public void callCount(Customer c) {
		if (call(c.number)) {
			c.callCount++;
			record.put(c.number, c.callCount);
		}
	}

	public void addCall(Customer c) {
		if (record.containsKey(c.number)) {
			if (c.callCount <= 20) {
				normalCustomer.add(c);
			} else {
				normalCustomer.remove(c);
				vipCustomer.add(c);
			}
		}
	}

	public void displayList() {
		System.out.println("Normal caller's");
		for (Customer c : normalCustomer) {
			System.out.println(c);
		}

		System.out.println("\nVIP caller's");
		for (Customer c : vipCustomer) {
			System.out.println(c);
		}
	}
}
