package com.bridgelabz.oops.inheritance.assistedproblems;

public class Intern extends Employee{
	private String mentorName;

    public Intern(String name, int id, double salary, String mentorName) {
        super(name, id, salary);
        this.mentorName = mentorName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("Mentor: " + mentorName);
    }
}
