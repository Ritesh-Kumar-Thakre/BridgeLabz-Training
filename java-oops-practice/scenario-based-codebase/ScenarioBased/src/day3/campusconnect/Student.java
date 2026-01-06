package day3.campusconnect;
import java.util.*;

public class Student extends Person implements ICourseActions {
	private char grade;
	private ArrayList<String> enrolledCourses = new ArrayList<>();

	public Student(String name, int id, String email, char grade) {
		super(name, id, email);
		this.grade = grade;
	}
 
	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	private HashMap<String, Character> courseGrades = new HashMap<>();

	public void addOrUpdateGrade(String courseName, char grade) {
		courseGrades.put(courseName, grade);
	}

	public double calculateGPA() {
		if (courseGrades.isEmpty()) {
			return 0.0;
		}

		double totalPoint = 0.0;
		for (char ch : courseGrades.values()) {
			switch (Character.toUpperCase(ch)) {
			case 'A':
				totalPoint += 4;break;
			case 'B':
				totalPoint += 3;break;
			case 'C':
				totalPoint += 2;break;
			case 'D':
				totalPoint += 1;break;
			default:
				totalPoint += 0;
			}
		}
        return totalPoint / courseGrades.size();
	}

	@Override
	public void enrollCourse(String courseName) {
		if (enrolledCourses.contains(courseName)) {
			System.out.println(name + " is already enrolled in " + courseName);
			return;
		}

		enrolledCourses.add(courseName);
		System.out.println(name + " enrolled in " + courseName);
	}

	@Override
	public void dropCourse(String courseName) {
		if (!enrolledCourses.contains(courseName)) {
			System.out.println(name + " is not enrolled in " + courseName);
			return;
		}

		enrolledCourses.remove(courseName);
		System.out.println(name + " dropped " + courseName);
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("GPA: "+calculateGPA());
		System.out.println("Grade: "+getGrade());
	}
}