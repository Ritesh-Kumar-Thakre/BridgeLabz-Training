package com.generics.multileveluniversitycoursemanagementsystem;

import java.util.List;

public class Wildcards {
	public static void displayAll(List<? extends CourseType> type) {
		for (CourseType course : type) {
			course.printCourses();
			course.evaluate();
			System.out.println();
		}
	}
}
