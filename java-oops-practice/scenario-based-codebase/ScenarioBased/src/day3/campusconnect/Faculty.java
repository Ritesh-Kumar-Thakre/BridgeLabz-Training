package day3.campusconnect;
import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
	String department;
	int yearsOfExperience;
	
	public Faculty(String department,int yearsOfExperience,String name, int id, String email) {
		super(name, id, email);
		this.department=department;
		this.yearsOfExperience=yearsOfExperience;
	}
	
    private List<String> assignedCourses = new ArrayList<>();
	

	public void assignCourse(String courseName) {
		assignedCourses.add(courseName);
		System.out.println(name+ " assigned to teacher "+courseName);
	}

	public void removeAssignedCourse(String courseName) {
		assignedCourses.remove(courseName);
        System.out.println(courseName + " removed from " + name + "'s course list");
	}
	
	@Override
	public void displayDetails() {
		System.out.println("********Faculty Details********");
		super.displayDetails();
		System.out.println("Department: "+department);
		System.out.println("Total Year of Experience: "+yearsOfExperience);
	}
	
}
