package com.generics.multileveluniversitycoursemanagementsystem;

public class ResearchCourse extends CourseType {

	public ResearchCourse(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public void evaluate() {
		System.out.println(courseName + ": Research-based evaluation");
	}
	@Override
	public void printCourses() {
		System.out.println("Course Name: "+courseName);	
	}
}
