import java.util.*;
public class PowerCalculation{
	public static int power(int base,int exponent){
		int result=(int)Math.pow(base,exponent);
		return result;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base");
		int base = sc.nextInt();
		System.out.println("Enter Exponent");
		int exponent=sc.nextInt();
		System.out.println(power(base,exponent));
	}
}