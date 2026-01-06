package day3.campusconnect;

import java.util.*;

public class Course {
	private int id;
	private String courseName;
	private List<Student> students = new ArrayList<>();
	private Faculty faculty;

	public Course(int id, String courseName) {
		this.id = id;
		this.courseName = courseName;
	}

	public void assignFaculty(Faculty faculty) {
		this.faculty = faculty;
		System.out.println("Faculty " + faculty.name + " assigned to course " + courseName);
	}

	public void enrollStudent(Student student) {
		students.add(student);
		System.out.println(student.name + " enrolled in " + courseName);
	}

	public void dropStudent(Student student) {
		students.remove(student);
		System.out.println(student.name + " removed from " + courseName);
	}

	public void printCourseDetails() {

		System.out.println("\n===== Course Details =====");
		System.out.println("Course ID : " + id);
		System.out.println("Course Name : " + courseName);

		if (faculty != null)
			System.out.println("Faculty : " + faculty.name);
		else
			System.out.println("Faculty : Not Assigned");

		System.out.println("Total Students : " + students.size());
	}

	// Display Enrolled Students
	public void showEnrolledStudents() {

		System.out.println("\n-- Enrolled Students in " + courseName + " --");

		if (students.isEmpty()) {
			System.out.println("No students enrolled yet.");
			return;
		}

		for (Student s : students) {
			System.out.println(s.name + " (ID: " + s.id + ")");
		}
	}
}
