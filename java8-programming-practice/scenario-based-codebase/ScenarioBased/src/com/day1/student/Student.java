package com.day1.student;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String firstName;
	private int age;
	private String gender;
	private String city;
	private int rank;
	private String department;
	private List<String> contacts;

	public Student(int id, String firstName, int age, String gender, String city, int rank, String department,
			List<String> contacts) {
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.rank = rank;
		this.department = department;
		this.contacts = contacts != null ? contacts : new ArrayList<>();
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getCity() {
		return city;
	}

	public int getRank() {
		return rank;
	}

	public String getDepartment() {
		return department;
	}

	public List<String> getContacts() {
		return contacts;
	}

	@Override
	public String toString() {
		return String.format("Student{id=%d, name='%s', age=%d, gender='%s', city='%s', rank=%d, dept='%s'}", id,
				firstName, age, gender, city, rank, department);
	}
}
