import java.util.*;
public class BonusOfEmployees {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking User Input
		System.out.println("Enter salary and year of service:");
		double salary= sc.nextDouble();
		double yearOfService= sc.nextDouble();
		double bonusAmount=0;
		double totalBonus=0;
		
		// Applying the required logic
		if(yearOfService>5.0){
			totalBonus=salary/5;
			bonusAmount=salary+totalBonus;
		}else{
			bonusAmount=salary;
		}
		
		// Printing the results
		if(yearOfService>5.0){
			System.out.println("Current salary is "+salary+" and given bonus is 5% in INR "+bonusAmount);
		}else{
			System.out.println("No bonus for employees whose year of service is less than 5");
		}
		sc.close();
	}
}