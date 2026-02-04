package com.day1.lambdas.student;

public class Student {
	String name;
	int age;
	int marks;
	int rank;

	public Student(String name, int age, int marks, int rank) {
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student{name='" + name + "', age=" + age + ", marks=" + marks + ", rank=" + rank + "}";
	}
}
