import java.util.*;
public class CalculateAverageMarks{	
	public static void main(String [] args){
		// Initializing values
		double maths=94;
		double physics=95;
		double chemistry=96;
		
		// Printing the average
		System.out.println("Sam's average mark in PCM is "+findAVG(maths,physics,chemistry));
	}
	
	// Method to find Average 
	public static double findAVG(double maths,double physics, double chemistry){
		double average= (maths+physics+chemistry)/3;
		return average;
	}
}