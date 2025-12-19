import java.util.*;

public class BMICalculator2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking number of persons
        System.out.println("Enter number of persons:");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Applying the required logic
        for (int i = 0; i < number; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            double weight = sc.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            double height = sc.nextDouble();
            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Enter positive values again.");
                i--;
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;
        }
        for (int i = 0; i < number; i++) {
            double heightInMeter = personData[i][1] / 100;
            double bmi = personData[i][0] / (heightInMeter * heightInMeter);
            personData[i][2] = bmi;
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Printing reversed number using array
        System.out.println("\nPerson Details:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person "+(i + 1)+" Weight: "+personData[i][0] + " kg"+" Height: "+personData[i][1]+" cm"+" BMI: "+personData[i][2]+" Status: "+weightStatus[i]);
        }
        sc.close();
    }
}
