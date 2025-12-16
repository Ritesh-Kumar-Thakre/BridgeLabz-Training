import java.util.*;
public class CalculateAverageOfThreeNumber{
	public static int calculateAverage(int num1,int num2,int num3){
		int result=(num1+num2+num3)/3;
		return result;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		System.out.println("Enter Third Number");
		int num3=sc.nextInt();
		System.out.println("Average Of Three Number is: "+calculateAverage(num1,num2,num3));
	}
}