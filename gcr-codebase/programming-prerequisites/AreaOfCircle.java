import java.util.*;
public class AreaOfCircle{

	public static double area(double num){
		double area=3.14*num*num;
		return area;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		double radius= sc.nextDouble();
		System.out.println(area(radius));
		
	}
}