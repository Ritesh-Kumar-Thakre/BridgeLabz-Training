import java.util.*;
public class FindAge{
	public static void main(String []args){
		// Initializing values
		String name = "Harry";
		int birthYear= 2000;
		int currentYear=2024;
		
		// Printing the current age
		System.out.println(name+"'s age in "+currentYear+" is "+findAge(birthYear,currentYear));
	}
	
	// Method to find current age
	public static int findAge(int birthYear,int currentYear){
		int age = currentYear-birthYear;
		return age;
	}
}