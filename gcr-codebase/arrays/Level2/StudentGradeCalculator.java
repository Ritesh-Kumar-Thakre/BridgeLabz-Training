import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input and creating arrays
        System.out.println("Enter number of students:");
        int students = sc.nextInt();
        double[][] marks = new double[students][3];
        double[] percentage = new double[students];
        char[] grade = new char[students];
        String[] remarks = new String[students];

        // Applying the required logic
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            double phy = sc.nextDouble();
            System.out.print("Chemistry: ");
            double chem = sc.nextDouble();
            System.out.print("Maths: ");
            double math = sc.nextDouble();
            if (phy < 0 || chem < 0 || math < 0) {
                System.out.println("Invalid marks. Enter positive values again.");
                i--;
                continue;
            }
            marks[i][0] = phy;
            marks[i][1] = chem;
            marks[i][2] = math;
        }
        // Calculating percentage and grade
        for (int i = 0; i < students; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            if (percentage[i] >= 80) {
                grade[i] = 'A';
                remarks[i] = "Level 4";
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
                remarks[i] = "Level 3";
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
                remarks[i] = "Level 2";
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
                remarks[i] = "Level 1";
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
                remarks[i] = "Too Below Standard";
            } else {
                grade[i] = 'R';
                remarks[i] = "Remedial Standard";
            }
        }

        // Printing the results
        System.out.println("Student Results:");
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) +" Physics: " + marks[i][0] +" Chemistry: " + marks[i][1] +" Maths: " + marks[i][2] +
								" Percentage: " + String.format("%.2f", percentage[i]) +"% | Grade: " + grade[i] +" | Remarks: " + remarks[i]);
        }
        sc.close();
    }
}
