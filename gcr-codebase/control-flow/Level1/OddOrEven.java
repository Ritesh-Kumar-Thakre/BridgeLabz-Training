import java.util.*;
public class OddOrEven{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter number:");
		int number= sc.nextInt();
		
		// Applying the required logic and printing the results
		if(number<0){
			System.out.println("It is not a natural number");
			return;
		}
		for(int i =1;i<=number;i++){
			if(i%2==0){
				System.out.println(i+" is even number");
			}else{
				System.out.println(i+" is odd number");
			}
		}
		sc.close();
	}
}