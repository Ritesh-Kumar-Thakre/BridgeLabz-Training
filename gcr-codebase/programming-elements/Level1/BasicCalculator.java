import java.util.*;
public class BasicCalculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking User Inputs and Creating Object of a class
		ArithmeticOperations  ar = new ArithmeticOperations();
		System.out.println("Enter two numbers:");
		float number1=sc.nextFloat();
		float number2 = sc.nextFloat();
		
		// Performing Arithmetic Operations
		float addition= ar.addition(number1,number2);
		float subtraction= ar.subtraction(number1,number2);
		float multiplication= ar.multiplication(number1,number2);
		float division= ar.division(number1,number2);
		
		
		// Printing the results
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition +","+ subtraction+","+ multiplication+" and"+division);
	}
	
	// Creating a class to perform Arithmetic Operations
	static class ArithmeticOperations {
		float addition(float number1,float number2){
			return number1+number2;
		}
		float subtraction(float number1,float number2){
			return number1-number2;
		}
		float multiplication (float number1,float number2){
			return number1*number2;
		}
		float division (float number1,float number2){
			return number1/number2;
		}
	}
}