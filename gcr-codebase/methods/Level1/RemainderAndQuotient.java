import java.util.*;
public class RemainderAndQuotient{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		double number1 =sc.nextDouble();
		double number2=sc.nextDouble();
		int arr[]=new int[2];
		
		// Applying the required logic and Printing the results
		findRemainderAndQuotient(number1,number2,arr);
		System.out.println("The quotient is "+arr[0]);
		System.out.println("The remainder is "+arr[1]);
		sc.close();
	}
	
	// Method to find remainder and quotient
	public static int[] findRemainderAndQuotient(double number1, double number2, int arr[]){
		arr[0] =(int)(number1/number2);
		arr[1]=(int)(number1%number2);
		return arr;
	}
}