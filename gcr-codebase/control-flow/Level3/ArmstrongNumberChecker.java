import java.util.*;
public class ArmstrongNumberChecker {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter a number:");
        int number= sc.nextInt();
        int originalNumber = number;
        int sum = 0;

        // Applying the required logic using while loop
        while(originalNumber!= 0) {
            int digit= originalNumber%10;
            sum= sum +(digit*digit*digit);
            originalNumber= originalNumber/10;
        }

        // Printing the result
        if (sum==number) {
            System.out.println(number+" is an Armstrong Number");
        } else {
            System.out.println(number+" is not an Armstrong Number");
        }
        sc.close();
	}
}