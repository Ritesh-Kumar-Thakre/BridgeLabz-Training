import java.util.*;
public class AddingTwoNumbers{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int first=sc.nextInt();
		System.out.println("Enter Second Number");
		int second = sc.nextInt();
		int sum= first+second;
		System.out.println("Answer is: " + sum);
	}
}