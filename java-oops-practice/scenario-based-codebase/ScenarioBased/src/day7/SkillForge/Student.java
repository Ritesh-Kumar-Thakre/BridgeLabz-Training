package day7.SkillForge;

public class Student extends User implements ICertifiable {
	private int completedModules;
	private int totalModules;
	private double grade;

	public Student(String name, String email) {
		super(name, email);
	}

	public void updateProgress(int completed, int total) {
		this.completedModules = completed;
		this.totalModules = total;
		this.grade = (completed * 100.0) / total;
	}

	public double getProgressPercent() {
		return grade;
	}

	@Override
	public void generateCertificate() {
		if (grade >= 60) {
			System.out.println("Certificate for Student: " + name);
			System.out.println("Status: Passed with " + grade + "%");
		} else {
			System.out.println(name + " not eligible for certificate.");
		}
	}

	@Override
	public void display() {
		System.out.println("Student: " + name);
		System.out.println("Email: " + email);
		System.out.println("Progress: " + grade + "%");
	}
}
