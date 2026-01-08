package day4.EduMentor;

public class Learner extends User implements ICertifiable {

	private double percentage;
	private String courseType; // SHORT / FULL_TIME

	public Learner(String name, String email, int userId, String courseType) {
		super(name, email, userId);
		this.courseType = courseType;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public void generateCertificate() {
		System.out.println("\n--- Certificate Status ---");

		if (courseType.equalsIgnoreCase("SHORT")) {
			if (percentage >= 60) {
				System.out.println("Certificate Generated for Short Course");
			} else {
				System.out.println("Not eligible for Short Course Certificate");
			}
		} else {
			if (percentage >= 75) {
				System.out.println("Certificate Generated for Full-Time Course");
			} else {
				System.out.println("Not eligible for Full-Time Certificate");
			}
		}
	}

	@Override
	public void displayUser() {
		super.displayUser();
		System.out.println("Course Type: " + courseType);
		System.out.println("Score Percentage: " + percentage);
	}
}