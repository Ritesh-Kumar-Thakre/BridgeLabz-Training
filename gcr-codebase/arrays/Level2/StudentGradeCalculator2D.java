import java.util.*;
public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input and arrays
        System.out.println("Enter number of students:");
        int students= sc.nextInt();
        double[][] marks= new double[students][3];
        double[] percentage= new double[students];
        char[] grade= new char[students];
        String[] remarks= new String[students];

        // Applying he required logic
        for (int i=0; i<students;i++) {
            System.out.println("Enter marks of "+(i + 1)+" Student in maths, physics,chemistry:");
            double physics =sc.nextDouble();
            double chemistry =sc.nextDouble();
            double maths =sc.nextDouble();
            if (physics < 0||chemistry<0||maths < 0){
                System.out.println("Invalid marks. Enter positive values again.");
                i--;
                continue;
            }
            marks[i][0] =physics;
            marks[i][1] =chemistry;
            marks[i][2] =maths;
        }
        // Calculating percentage and grade
        for (int i = 0; i < students; i++) {
            percentage[i] = (marks[i][0]+marks[i][1]+marks[i][2])/3;
            if (percentage[i] >= 80) {
                grade[i] = 'A';
                remarks[i] = "Level 4";
            }else if (percentage[i]>=70){
                grade[i] = 'B';
                remarks[i] = "Level 3";
            }else if (percentage[i]>=60){
                grade[i] = 'C';
                remarks[i] = "Level 2";
            }else if (percentage[i]>=50){
                grade[i] = 'D';
                remarks[i] = "Level 1";
            }else if (percentage[i]>=40){
                grade[i]='E';
                remarks[i] = "Too Below Standard";
            }else{
                grade[i] ='R';
                remarks[i] ="Remedial Standard";
            }
        }

        // Printing the results
        System.out.println("Student Details:");
        for(int i =0; i<students;i++){
            System.out.println("Student "+ (i+1)+" Physics: "+marks[i][0]+" Chemistry: "+marks[i][1]+" Maths: " + marks[i][2] +" Percentage: "+percentage[i] + 
								"%" +" Grade: "+grade[i] +" Remarks: "+remarks[i]);
        }
        sc.close();
    }
}
