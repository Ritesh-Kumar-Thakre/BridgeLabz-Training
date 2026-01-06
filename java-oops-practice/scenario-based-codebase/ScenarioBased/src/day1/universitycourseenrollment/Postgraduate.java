package day1.universitycourseenrollment;

public class Postgraduate extends Student{
	private String electivePreference;
	
	public Postgraduate(String stuId, String name, String electivePreference) {
		super(stuId, name);
		this.electivePreference = electivePreference;
		this.studentType = "PG";
	}
	
	@Override
	public void displayDetails() {
		System.out.println("PostGraduate: " + getName());
		System.out.println("Preference: " + electivePreference);
	}
}
