package day1.universitycourseenrollment;

public abstract class Student {
	
	private String stuId;
	private String name;
	private double gpa;
	protected String studentType; // UG, PG
	private String elective;  // AI, DS, AIDS, AIML
	
	public Student(String stuId, String name) {
		this.stuId = stuId;
		this.name = name;
	}
	
	public Student(String stuId, String name, String elective) {
		this.stuId = stuId;
		this.name = name;
		this.elective = elective;
	}
	
	public void updateGPA(double score) {
		this.gpa = score;
	}
	
	public void getTranscript() {
		System.out.println("Student Name: " + getName());
		System.out.println("GPA : " + gpa);
	}
	
	protected String getName() {
		return name;
	}
	
	public abstract void displayDetails();
}
