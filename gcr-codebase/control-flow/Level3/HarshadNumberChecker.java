import java.util.*;
public class HarshadNumberChecker{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int originalNumber=number;
        int sum =0;

        // Applying the required logic to find sum of digits
        while(number!=0) {
            int digit =number%10;
            sum = sum+digit;
            number= number/10;
        }

        //Printing the result
        if(sum!=0 && originalNumber%sum==0) {
            System.out.println(originalNumber+" is a Harshad Number");
        } else{
            System.out.println(originalNumber+" is not a Harshad Number");
        }
        sc.close();
	}
}