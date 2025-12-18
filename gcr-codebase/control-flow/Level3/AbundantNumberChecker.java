import java.util.*;
public class AbundantNumberChecker{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int sum=0;

        // Applying the required logic to find sum of divisors
        for(int i= 1; i< number;i++) {
            if(number%i == 0){
                sum=sum+i;
            }
        }

        // Printing the results
        if (sum>number) {
            System.out.println(number+" is an Abundant Number");
        } else {
            System.out.println(number+" is not an Abundant Number");
        }
        sc.close();
	}
}