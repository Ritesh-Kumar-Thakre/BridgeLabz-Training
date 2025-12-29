import java.util.*;
public class ResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        System.out.println("Enter marks of 5 subjects (out of 100):");

        // Applying the required logic
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter again.");
                i--;
                continue;
            }
            total += marks[i];
        }
        double average = total / 5.0;
        char grade;
        switch ((int) average / 10) {
            case 10:
            case 9: grade = 'A'; break;
            case 8: grade = 'B'; break;
            case 7: grade = 'C'; break;
            case 6: grade = 'D'; break;
            default: grade = 'F';
        }

        // Display result
        System.out.println("\n------ RESULT ------");
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + String.format("%.2f", average));
        System.out.println("Grade        : " + grade);
        sc.close();
    }
}
