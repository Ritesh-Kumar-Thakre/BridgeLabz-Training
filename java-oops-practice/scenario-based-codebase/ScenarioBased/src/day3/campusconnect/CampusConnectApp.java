package day3.campusconnect;

public class CampusConnectApp {

	public static void main(String[] args) {

		Faculty f1 = new Faculty("Dr. Mehta", 201, "mehta@college.edu", 12, "Computer Science");

		Student s1 = new Student("Ritesh", 101, "ritesh@mail.com", 'A');
		Student s2 = new Student("Neha", 102, "neha@mail.com", 'B');

		Course c1 = new Course(1, "Data Structures");

		c1.enrollStudent(s1);
		c1.enrollStudent(s2);

		s1.addOrUpdateGrade("Data Structures", 'A');
		s2.addOrUpdateGrade("Data Structures", 'B');

		f1.displayDetails();
		s1.displayDetails();
		s2.displayDetails();

		c1.printCourseDetails();
	}
}
