import java.util.*;
public class PerimeterOfRectangle{
	public static int perimeterCalculate(int length,int width){
		int pm=2*(length+width);
		return pm;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int length=sc.nextInt();
		int width= sc.nextInt();
		System.out.println(perimeterCalculate(length,width));
	}
}