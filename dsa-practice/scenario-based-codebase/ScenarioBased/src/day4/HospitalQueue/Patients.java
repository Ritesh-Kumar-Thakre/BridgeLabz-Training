package day4.HospitalQueue;

public class Patients {
	protected String name;
	protected int age;
//	protected String arrivalTime;
	protected int criticalityLevel;

	public Patients(String name, int age, int criticalityLevel) {
		this.name = name;
		this.age = age;
//		this.arrivalTime = arrivalTime;
		this.criticalityLevel = criticalityLevel;
	}
	
	public void printParent() {
		
	}
}
