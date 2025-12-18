import java.util.*;
public class CountDigits {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int count=0;

        // Applying the required logic
        if(number==0){
            count=1;
        }else{
            while(number!=0) {
                number=number/10;
                count++;
            }
        }

        // Printing the result
        System.out.println("The number of digits in "+number+" is "+count);
        sc.close();
	}
}