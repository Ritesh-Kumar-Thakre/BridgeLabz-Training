package com.bridgelabz.oops.constructor.levelone;

public class UniversityApp {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Ritesh", 8.4);
        System.out.println("Student Details:");
        s1.displayDetails();

        System.out.println();
        System.out.println("Updating CGPA...");
        s1.modifyCGPA(8.9);

        System.out.println();
        s1.displayDetails();

        System.out.println("\nPostgraduate Student\n");

        PostgraduateStudent pg =new PostgraduateStudent(201, "Rahul", 9.1, "Data Science");

        pg.displayPostgraduateDetails();
    }
}
