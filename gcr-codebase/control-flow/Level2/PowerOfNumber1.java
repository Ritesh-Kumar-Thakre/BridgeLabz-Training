import java.util.*;
public class  PowerOfNumber1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a number:");
		int number= sc.nextInt();
		System.out.println("Enter a power:");
		int power= sc.nextInt();
		int result = 1;
		
		// Applying the required logic
		if(number>0 && power>0){
			for(int i =1;i<=power;i++){
				result=number*result;
			}
			System.out.println("The final result is "+result);
		}else{
			System.out.println("Number and power must be positive integers");
		}		
		sc.close();
	}
}