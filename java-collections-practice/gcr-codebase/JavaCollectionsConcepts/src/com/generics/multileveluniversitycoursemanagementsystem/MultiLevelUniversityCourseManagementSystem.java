package com.generics.multileveluniversitycoursemanagementsystem;

public class MultiLevelUniversityCourseManagementSystem {

	public static void main(String[] args) {
		Course<ExamCourse> eCourse = new Course<>();
		eCourse.addItem(new ExamCourse("Maths"));
		Wildcards.displayAll(eCourse.getItems());

		Course<AssignmentCourse> aCourse = new Course<>();
		aCourse.addItem(new AssignmentCourse("Java"));
		Wildcards.displayAll(aCourse.getItems());

		Course<ResearchCourse> rCourse = new Course<>();
		rCourse.addItem(new ResearchCourse("medical"));
		Wildcards.displayAll(rCourse.getItems());
	}
}
