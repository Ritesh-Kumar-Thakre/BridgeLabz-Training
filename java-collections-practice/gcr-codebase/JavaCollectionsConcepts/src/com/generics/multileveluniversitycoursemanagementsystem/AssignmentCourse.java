package com.generics.multileveluniversitycoursemanagementsystem;

public class AssignmentCourse extends CourseType {

	public AssignmentCourse(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public void evaluate() {
		System.out.println(courseName + ": Assignment-based evaluation");

	}
	@Override
	public void printCourses() {
		System.out.println("Course Name: "+courseName);	
	}

}
