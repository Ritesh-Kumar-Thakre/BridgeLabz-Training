package day1.universitycourseenrollment;

public class Enrollment implements Grade{
	private Student student;
	private String courseName;
	private String finalGrade;
	
	public Enrollment(Student student, String courseName) {
		this.student = student;
		this.courseName = courseName; 
	}
	
	@Override
	public void assignGrade(double score) {
		if(score >= 90)
			finalGrade = "A+";
		else if(score >= 80)
			finalGrade = "A";
		else if(score >= 70)
			finalGrade = "C";
		else if(score >= 50)
			finalGrade = "D";
		else
			finalGrade = "F";
		
		student.updateGPA(score / 10); 
        System.out.println("Grade " + finalGrade + " assigned to " + student.getName());
	}
}
