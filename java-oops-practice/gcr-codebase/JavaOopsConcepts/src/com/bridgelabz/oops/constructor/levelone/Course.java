package com.bridgelabz.oops.constructor.levelone;

public class Course {

    String courseName;
    String duration;
    double fee;    

    static String instituteName = "Tech Academy";

    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // instance method
    public void displayCourseDetails() {
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration);
        System.out.println("Fee           : " + fee);
        System.out.println("Institute     : " + instituteName);
    }

    // class method (static)
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
