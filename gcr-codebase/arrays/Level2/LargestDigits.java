import java.util.*;
public class LargestDigits{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Initialize Array's and Variable's
		int number=sc.nextInt();
		int maxDigit =10;
		int digits[]=new int [maxDigit];
		int index =0;
		int temp=number;
		int digit;
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		// Applying the required logic
		while(number!=0){
			digit=number%10;
			digits[index++]=digit;
			number=number/10;
			if(index==maxDigit){
				break;
			}
		}
		for(int i=0;i<digits.length;i++){
			if(digits[i]>firstMax){
				secondMax=firstMax;
				firstMax=digits[i];
	 		}else if(digits[i]>secondMax&& digits[i]!=firstMax){
					secondMax=digits[i];
			}
		}
		
		// Printing the results
		System.out.println("The largest digit is "+firstMax);
		System.out.println("The second largest is "+secondMax);
		sc.close();
	}
}