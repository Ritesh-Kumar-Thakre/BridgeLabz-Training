import java.util.*;
public class BMICalculator2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int number=10;
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
		double weight=0;
		double height=0;

        // Applying the required logic
        for (int i = 0; i < number; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            weight = sc.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
			height = sc.nextDouble();
            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Enter positive values again.");
                i--;
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;
        }
		for (int i = 0; i < number; i++) {
            weightStatus[i] = calculateBMI(personData, i);
        }

        // Printing the results
        System.out.println("Person Details:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person "+(i + 1)+" Weight: "+personData[i][0] + " kg"+" Height: "+personData[i][1]+" cm"+
								" BMI: "+personData[i][2]+" Status: "+weightStatus[i]);
        }
        sc.close();
    }
	
	// Method to find BMI
	public static String calculateBMI(double personData[][],int idx){
		double heightInMeter = personData[idx][1] / 100;
		double bmi = personData[idx][0] / (heightInMeter * heightInMeter);
		personData[idx][2] = bmi;
			if (bmi <= 18.4) {
                return "Underweight";
            } else if (bmi <= 24.9) {
                return"Normal";
            } else if (bmi <= 39.9) {
                return "Overweight";
            }
		return "Obese";
	}
}
