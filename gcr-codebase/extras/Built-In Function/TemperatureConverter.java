import java.util.*;
public class TemperatureConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
		
		// Applying the required logic and printing the results
        if(choice == 1){
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit = " + celsiusToFahrenheit(c));
        }
        else if(choice == 2){
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Celsius = " + fahrenheitToCelsius(f));
        }
        else{
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
	
	// Method to convert celsius to fahrenheit
	static double celsiusToFahrenheit(double c){
        return (c * 9/5) + 32;
    }
	
	// Method to convert fahrenheit to celsius
    static double fahrenheitToCelsius(double f){
        return (f - 32) * 5/9;
    }
}
