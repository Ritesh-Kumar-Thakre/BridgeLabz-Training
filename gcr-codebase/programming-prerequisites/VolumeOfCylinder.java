import java.util.*;
public class VolumeOfCylinder{
	public static double volume(double radius, double height){
		double volume=3.14*(radius*radius)*height;
		return volume;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		double radius=sc.nextDouble();
		System.out.println("Enter Height");
		double height=sc.nextDouble();
		System.out.println("Volume of Cylinder is: "+volume(radius,height));
	}
}