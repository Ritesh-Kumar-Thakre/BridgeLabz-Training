import java.util.*;
public class ConvertKilometersToMiles{
	public static double converToMiles(double num){
		double result=num*0.621371;
		return result;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in Kilometer: ");
		double kilometer=sc.nextDouble();
		System.out.println(kilometer+" Kilometer = "+converToMiles(kilometer)+" Miles");
	}
}