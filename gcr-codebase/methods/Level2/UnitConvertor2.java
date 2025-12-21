import java.util.*;
public class UnitConvertor2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit conversion type : y-f / f-y / m-i / i-m / i-c");
		String unit= sc.next();
		System.out.println("Enter value:");
		int value = sc.nextInt();
		
		// Applying the required logic and Printing the results
		if(unit.equals("y-f")){
			System.out.println(value+" yards: "+convertYardsToFeet(value)+" feet");
		}else if(unit.equals("f-y")){
			System.out.println(value+" feet: "+convertFeetToYards(value)+" yards");
		}else if(unit.equals("m-i")){
			System.out.println(value+" meter: "+convertMetersToInches(value)+" inche");
		}else if(unit.equals("i-m")){
			System.out.println(value+" inche: "+convertInchesToMeters(value)+" meter");
		}else if(unit.equals("i-c")){
			System.out.println(value+" inche: "+convertInchesToCm(value)+" centimetre");
		}
		sc.close();
	}
	
	// Method to convert yards to feet
	public static double convertYardsToFeet(double yards) {
		return yards*3;
	}
	
	// Method to convert feet to yards
	public static double convertFeetToYards(double feet) {
		return feet*0.333333;
	}
	
	// Method to convert meters to inches
	public static double convertMetersToInches(double meter) {
		return meter*39.3701;
	}
	
	// Method to convert inches to meters
	public static double convertInchesToMeters(double inche) {
		return inche*0.0254;
	}
	
	// Method to convert inches to centimetre
	public static double convertInchesToCm(double inche) {
		return inche*2.54;
	}
}