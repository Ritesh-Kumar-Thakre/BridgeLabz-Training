import java.util.*;
public class EnterZeroOrNegative{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Taking user input
		System.out.println("Enter Number:");
		double number=sc.nextDouble();
		double total= 0.0;
		
		// Applying while loop
		while(true){
			if(number<1){
				break;
			}else{
				total+=number;
				System.out.println("Try again:");
				number=sc.nextDouble();
			}
		}
		
		// Printing the results
		System.out.println(total);
		sc.close();
	}
}