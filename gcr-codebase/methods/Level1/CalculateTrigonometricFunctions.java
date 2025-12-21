import java.util.*;
public class CalculateTrigonometricFunctions{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle:");
		double angle =sc.nextDouble();
		double arr[]= new double[3];
		
		// Applying the required logic and Printing the results
		double radian= angle*(3.14 / 180); 
		calculateFunctions(radian,arr);
		System.out.println("Sine, Cosine and Tangent for angle "+angle+" is "+arr[0]+", "+arr[1]+", "+arr[2]);
		sc.close();
	}
	
	// Method to calculate various trigonometric functions
	public static double[] calculateFunctions(double radian,double arr[]){
		arr[0]=Math.sin(radian);
		arr[1]=Math.cos(radian);
		arr[2]=Math.tan(radian);
		return arr;
	}
}