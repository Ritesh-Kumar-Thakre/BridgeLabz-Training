import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking number of persons
        System.out.println("Enter number of persons:");
        int persons = sc.nextInt();
        double[] weight = new double[persons];
        double[] height = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];

        // Applying the required logic
        for (int i = 0; i < persons; i++) {
            System.out.println("Enter weight of person "+(i+1)+":");
            weight[i] = sc.nextDouble();

            System.out.println("Enter height of person "+(i+1)+":");
            height[i] = sc.nextDouble();
        }
        for (int i = 0; i < persons; i++) {
            double heightInMeter = height[i] / 100;
            bmi[i] = weight[i] / (heightInMeter * heightInMeter);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Printing reversed number using array
        System.out.println("\nPerson Details:");
        for (int i = 0; i < persons; i++) {
            System.out.println("Person "+(i+1)+" Height: "+height[i] +" cm Weight: "+weight[i]+" kg"+" BMI: "+String.format("%.2f", bmi[i])+" Status: "+status[i]);
        }
        sc.close();
    }
}
