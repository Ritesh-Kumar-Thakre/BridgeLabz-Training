import java.util.*;
public class EuclideanDistanceAndLineEquation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1 and y1:");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.println("Enter x2 and y2:");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();

		// Applying the required logic
        double distance = findDistance(x1,y1,x2,y2);
        double[] line = findLineEquation(x1,y1,x2,y2);

		// Printing the results
        System.out.println("Euclidean Distance : "+distance);
        System.out.println("Equation of line : y = "+line[0]+"x + "+line[1]);
        sc.close();
    }

    // method to calculate Euclidean distance
    public static double findDistance(double x1,double y1,double x2,double y2){
        double dx = Math.pow(x2-x1,2);
        double dy = Math.pow(y2-y1,2);
        return Math.sqrt(dx+dy);
    }

    // method to calculate slope and y-intercept
    public static double[] findLineEquation(double x1,double y1,double x2,double y2){
        double result[] = new double[2];
        double m = (y2-y1)/(x2-x1);
        double b = y1 - m*x1;
        result[0]=m;
        result[1]=b;
        return result;
    }
}
