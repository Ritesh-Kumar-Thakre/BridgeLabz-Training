import java.util.*;
public class  FindFactors1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		
		// Applying the required logic
		if(number>0){
			for(int i =1;i<number;i++){
				if(number%i==0){
					System.out.println(i);
				}
			}
		}else{
			System.out.println("Entered number is not a positive integer");
		}
		sc.close();
	}
}