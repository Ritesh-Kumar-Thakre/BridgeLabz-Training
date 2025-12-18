import java.util.*;
public class StudentGradeCalculator{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter the marks of physics, chemistry, and maths:");
		double physics=sc.nextDouble();
		double chemistry=sc.nextDouble();
		double maths=sc.nextDouble();
		String grade;
		String remark;
		
		// Applying the required logic
		double percentage= (physics+chemistry+maths)/3;
		if (percentage>=80) {
			grade ="A";
			remark ="Level 4, above agency-normalized standards";
		} else if(percentage>= 70) {
			grade= "B";
			remark ="Level 3, at agency-normalized standards";
		} else if(percentage>= 60) {
			grade ="C";
			remark ="Level 2, below but approaching agency-normalized standards";
		} else if(percentage>= 50) {
			grade ="D";
			remark ="Level 1, well below agency-normalized standards";
		} else if(percentage>= 40) {
			grade ="E";
			remark ="Level 1-, too below agency-normalized standards";
		} else {
			grade ="R";
			remark ="Remedial standards";
		}

		// Printing the results
		System.out.println("the Average Mark is "+percentage+" and the Grade are "+ grade+" and Remarks is "+remark);
		sc.close();
	}
}