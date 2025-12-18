import java.util.*;
public class  FindFactors2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		
		// Applying the required logic
		if(number>0){
			int i=1;
			while(i<number){
				if(number%i==0){
					System.out.println(i);
				}
				i++;
			}
		}else{
			System.out.println("Entered number is not a positive integer");
		}
		sc.close();
	}
}