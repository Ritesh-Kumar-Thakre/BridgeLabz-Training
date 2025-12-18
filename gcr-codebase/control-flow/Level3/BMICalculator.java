import java.util.*;
public class BMICalculator{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter weight in kg:");
        double weight = sc.nextDouble();
        System.out.println("Enter height in cm:");
        double heightCm = sc.nextDouble();
		String status;

        // Applying the required logic
        double heightMeter= heightCm/100;
        double bmi = weight/(heightMeter* heightMeter);
        if(bmi<=18.4) {
            status ="Underweight";
        } else if(bmi <= 24.9) {
            status ="Normal";
        } else if(bmi <= 39.9) {
            status ="Overweight";
        } else{
            status ="Obese";
        }

        // Printing the results
        System.out.println("BMI is "+bmi+"\nWeight Status: "+status);
        sc.close();
	}
}