package com.bridgelabz.oops.constructor.levelone;

public class CourseApp {
    public static void main(String[] args) {

        Course c1 = new Course("Java Development", "6 Months", 15000);
        Course c2 = new Course("Data Science", "8 Months", 22000);

        System.out.println("Before Updating Institute:\n");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        System.out.println("\nUpdating Institute Name...\n");
        Course.updateInstituteName("Bridgelabz");

        System.out.println("After Updating Institute:\n");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
