import java.util.*;
public class CheckNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a Number:");
		int number= sc.nextInt();
		String result="";
		
		// Applying Conditional Statements
		if(number>0){
			result="Positive Number";
		}else if (number<0){
			result="Negative Number";
		}else{
			result="Zero";
		}
		
		// Printing the result and close the Scanner Stream
		System.out.println(result);
		sc.close();
	}
}