import java.util.*;
public class UnitConvertor3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit conversion type : f-c / c-f / p-k / k-p / g-l / l-g");
		String unit= sc.next();
		System.out.println("Enter value:");
		int value = sc.nextInt();
		
		// Applying the required logic and Printing the results
		if(unit.equals("f-c")){
			System.out.println(value+" Farhenheit: "+convertFarhenheitToCelsius(value)+" Celsius");
		}else if(unit.equals("c-f")){
			System.out.println(value+" Celsius: "+convertCelsiusToFarhenheit(value)+" Farhenheit");
		}else if(unit.equals("p-k")){
			System.out.println(value+" pounds: "+convertPoundsToKilograms(value)+" Kilograms");
		}else if(unit.equals("k-p")){
			System.out.println(value+" kilograms: "+convertKilogramsToPounds(value)+" pounds");
		}else if(unit.equals("g-l")){
			System.out.println(value+" gallons: "+convertGallonsToLiters(value)+" liters");
		}else if(unit.equals("l-g")){
			System.out.println(value+" liters: "+convertLitersToGallons(value)+" gallons");
		}
		sc.close();
	}
	
	// Method to convert Farhenheit to Celsius
	public static double convertFarhenheitToCelsius(double farhenheit ) {
		return (farhenheit - 32) * 5 / 9;
	}
	
	// Method to convert Celsius to Farhenheit
	public static double convertCelsiusToFarhenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}
	
	// Method to convert pounds to Kilograms
	public static double convertPoundsToKilograms(double pound) {
		return pound*0.453592;
	}
	
	// Method to convert kilograms to pounds
	public static double convertKilogramsToPounds(double kilograms) {
		return kilograms*2.20462;
	}
	
	// Method to convert gallons to liters
	public static double convertGallonsToLiters(double gallons) {
		return gallons*3.78541;
	}
	
	// Method to convert liters to gallons
	public static double convertLitersToGallons(double liters) {
		return liters*0.264172;
	}
}