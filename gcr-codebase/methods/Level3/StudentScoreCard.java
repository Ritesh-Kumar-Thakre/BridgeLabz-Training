import java.util.*;
public class StudentScoreCard{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int students=sc.nextInt();

        // Applying the required logic and Printing the results
        int[][] pcmMarks=generatePCMScores(students);
        double[][] results=calculateResults(pcmMarks);
        displayScoreCard(pcmMarks,results);
        sc.close();
    }

    // Method to generate random 2-digit PCM marks
    static int[][] generatePCMScores(int students){
        int[][] marks=new int[students][3];
        for(int i=0;i<students;i++){
            marks[i][0]=(int)(Math.random()*90)+10; // Physics
            marks[i][1]=(int)(Math.random()*90)+10; // Chemistry
            marks[i][2]=(int)(Math.random()*90)+10; // Maths
        }
        return marks;
    }

    // Method to calculate total, average and percentage
    static double[][] calculateResults(int[][] marks){
        double[][] result=new double[marks.length][3];
        for(int i=0;i<marks.length;i++){
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            double average=total/3.0;
            double percentage=(total/300.0)*100;
            result[i][0]=total;
            result[i][1]=Math.round(average*100)/100.0;
            result[i][2]=Math.round(percentage*100)/100.0;
        }
        return result;
    }

    // Method to display student scorecard
    static void displayScoreCard(int[][] marks,double[][] result){
        System.out.println("\nStudent\tPhy\tChem\tMath\tTotal\tAverage\tPercentage");
        for(int i=0;i<marks.length;i++){
            System.out.println(
                (i+1)+"\t"+
                marks[i][0]+"\t"+
                marks[i][1]+"\t"+
                marks[i][2]+"\t"+
                (int)result[i][0]+"\t"+
                result[i][1]+"\t"+
                result[i][2]
            );
        }
    }
}
