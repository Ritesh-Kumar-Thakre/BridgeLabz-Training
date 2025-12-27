import java.util.Scanner;
public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Maya's BMI Fitness Tracker");
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();
		
        // Applying the required logic and printing the results
        double bmi = weight/(height * height);
        System.out.println("\nYour BMI is: " + bmi);
        // Determine BMI category using if-else
        if(bmi<18.5){
            System.out.println("Category: Underweight");
        }else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Category: Normal");
        }else {
            System.out.println("Category: Overweight");
        }
        sc.close();
    }
}
