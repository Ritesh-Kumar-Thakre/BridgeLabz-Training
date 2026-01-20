package day4.HospitalQueue;

public class ApolloHospital {
	public static void main(String[] args) {
		Patients p1 = new Patients("Q", 21, 3);
		Patients p2 = new Patients("W", 22, 5);
		Patients p3 = new Patients("E", 26, 6);
		Patients p4 = new Patients("R", 45, 2);
		Patients p5 = new Patients("T", 41, 9);
		Patients p6 = new Patients("Y", 34, 10);
		Patients p7 = new Patients("U", 26, 3);
		Patients p8 = new Patients("I", 15, 6);
		Patients p9 = new Patients("O", 63, 2);
		Patients p10 = new Patients("P", 19, 8);

		Patients[] patients = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 };

		for (int i = 0; i < patients.length - 1; i++) {
			for (int j = 0; j < patients.length - 1 - i; j++) {
				if (patients[j].criticalityLevel > patients[j + 1].criticalityLevel) {
					// swap
					Patients temp = patients[j];
					patients[j] = patients[j + 1];
					patients[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted List of Patients:");
		for (Patients p : patients) {
			System.out.println(
					"\nName: " + p.name + "\n" + "Age: " + p.age + "\n" + "Criticality Level: " + p.criticalityLevel);
		}
	}
}
