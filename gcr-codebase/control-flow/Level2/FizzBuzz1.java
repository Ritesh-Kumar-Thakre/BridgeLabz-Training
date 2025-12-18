import java.util.*;
public class FizzBuzz1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		// Applying the required logic and printing the result
		if(number>0){
			for(int i =1;i<=number;i++){
				if(i%3==0&&i%5==0){
					System.out.println("FizzBuzz");
				}else if(i%3==0){
					System.out.println("Fizz");
				}else if(i%5==0){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}
			}
		}else{
			System.out.println("Entered number is not a positive integer");
		}
		sc.close();
	}
}