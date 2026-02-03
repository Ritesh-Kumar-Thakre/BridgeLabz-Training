package com.collectors.studentresultgrouping;

public class Student {
	protected String name;
	private char grade;
	protected int rollNumber;

	public Student(String name, char grade, int rollNumber) {
		this.name = name;
		this.grade = grade;
		this.rollNumber = rollNumber;
	}

	public char getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return name + " | Grade: " + grade + " | Roll Number: " + rollNumber;
	}

}
