import java.util.*;
public class FizzBuzz2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int temp=1;
		
		// Applying the required logic and printing the result
		if(number>0){
			while(temp<number+1){
				if(temp%3==0&&temp%5==0){
					System.out.println("FizzBuzz");
				}else if(temp%3==0){
					System.out.println("Fizz");
				}else if(temp%5==0){
					System.out.println("Buzz");
				}else{
					System.out.println(temp);
				}
				temp++;
			}
		}else{
			System.out.println("Entered number is not a positive integer");
		}
		sc.close();
	}
}