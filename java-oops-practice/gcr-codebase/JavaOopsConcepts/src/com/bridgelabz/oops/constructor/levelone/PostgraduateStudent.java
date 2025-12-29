package com.bridgelabz.oops.constructor.levelone;

public class PostgraduateStudent extends Student {

    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {

        System.out.println("PG Student Name   : " + name); // allowed (protected)
        System.out.println("Roll Number       : " + rollNumber); // allowed (public)
        System.out.println("Specialization    : " + specialization);

        // accessing CGPA through getter (because it is private)
        System.out.println("CGPA              : " + accesCGPA());
    }
}
