import java.util.*;
public class BonusOfEmployees {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Initialize Array's and Variable's
		int employees=10;
		double salary[]= new double[employees];
		double yearOfService[]= new double[employees];
		double newSalary[]=new double[employees];
		double bonuAmount[]=new double[employees];
		double totalBonus=0.0;
		double totalOldSalary=0.0;
		double totalNewSalary=0.0;
		
		// Applying the required logic
		System.out.println("Enter salary and year of srvice of the employees");
		for (int i = 0; i < employees; i++) {
            double sal = sc.nextDouble();
            double yrs = sc.nextDouble();
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input. Enter again:");
                i--;
                continue;
            }
            salary[i] = sal;
            yearOfService[i] = yrs;
        }
		for (int i = 0; i < employees; i++) {
				if(yearOfService[i]>5.0){
					bonuAmount[i]=(salary[i]*0.05);
				}else {
					bonuAmount[i]=(salary[i]*0.02);
				}
				newSalary[i]=(salary[i]+bonuAmount[i]);
				totalBonus+=bonuAmount[i];
				totalOldSalary+=salary[i];
				totalNewSalary+=newSalary[i];
		}

		// Printing the results
		for(int i =1;i<=employees;i++){
			System.out.println("The total bonus payout of employee "+i+" is "+bonuAmount[i-1]+
								" and the old salary is "+salary[i-1]+" and the new salary is "+newSalary[i-1]);
		}
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
		sc.close();
	}
}