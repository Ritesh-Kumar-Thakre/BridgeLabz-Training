package day1.universitycourseenrollment;

public class Undergraduate extends Student{
			
	public Undergraduate(String stuId, String name) {
		super(stuId, name);
		this.studentType = "UG";
	}
	
	@Override
	public void displayDetails() {
		System.out.println("UnderGraduate: " + getName());
	}
}
