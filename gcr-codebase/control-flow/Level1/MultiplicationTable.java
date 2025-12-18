import java.util.*;
public class MultiplicationTable{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter number:");
		int number= sc.nextInt();
		
		// Applying the required logic
		for(int i =6;i<=9;i++){
			System.out.println(number+" * "+i+" = "+(number*i));
		}
		sc.close();
	}
}