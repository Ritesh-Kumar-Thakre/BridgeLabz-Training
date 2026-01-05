package day1.hospitalpatientmanagementsystem;

public class Patient {

	private int patientId;
	private String name;
	private int age;
	private String medicalHistory;

	protected String admissionType;

	public Patient(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.admissionType = "Normal";
	}

	public Patient(int patientId, String name, int age, String medicalHistory) {
		this(patientId, name, age);
		this.admissionType = "Emergency";
		this.medicalHistory = medicalHistory;
	}

	public String getSummary() {
		return "Patient ID: " + patientId + "\nName: " + name + "\nAge: " + age + "\nAdmission Type: " + admissionType;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public String getMedicalHistory() {
		return "Access Restricted"; 
	}

	public void displayInfo() {
		System.out.println(getSummary());
	}
}
