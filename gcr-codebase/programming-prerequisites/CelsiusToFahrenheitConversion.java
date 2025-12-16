import java.util.*;
public class CelsiusToFahrenheitConversion{
	
	public static int convert(int num){
		int faherenheit=(num*9/5)+32;
		return faherenheit;
	}
	
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Celsius");
		int celsius= sc.nextInt();
		System.out.println(convert(celsius));
	}

}
