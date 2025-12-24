import java.util.*;
public class PCMGradeCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();

		// Applying the required logic
        int[][] pcm=generatePCM(n);
        double[][] res=calculate(pcm);
        char[] grade=calculateGrade(res);
        display(pcm,res,grade);
        sc.close();
    }

    // Method to Generate random PCM scores
    static int[][] generatePCM(int n){
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++){
            a[i][0]=(int)(Math.random()*90)+10;
            a[i][1]=(int)(Math.random()*90)+10;
            a[i][2]=(int)(Math.random()*90)+10;
        }
        return a;
    }

    // Method to Calculate total, average & percentage
    static double[][] calculate(int[][] pcm){
        double[][] r=new double[pcm.length][3];
        for(int i=0;i<pcm.length;i++){
            double total=pcm[i][0]+pcm[i][1]+pcm[i][2];
            double avg=total/3;
            double per=(total/300)*100;
            r[i][0]=total;
            r[i][1]=Math.round(avg*100)/100.0;
            r[i][2]=Math.round(per*100)/100.0;
        }
        return r;
    }

    // Method to Assign grades
    static char[] calculateGrade(double[][] r){
        char[] g=new char[r.length];
        for(int i=0;i<r.length;i++){
            double p=r[i][2];
            if(p>=80){
				g[i]='A';
			}else if(p>=70){ 
				g[i]='B';
            }else if(p>=60){ 
				g[i]='C';
            }else if(p>=50){ 
				g[i]='D';
            }else if(p>=40){ 
				g[i]='E';
            }else {
				g[i]='R';
			}
        }
        return g;
    }

	// Method to display results
    static void display(int[][] pcm,double[][] r,char[] g){
        System.out.println("P\tC\tM\tTotal\tAvg\t%\tGrade");
        for(int i=0;i<pcm.length;i++){                                                     
            System.out.println(pcm[i][0]+"\t"+pcm[i][1]+"\t"+pcm[i][2]+"\t"+r[i][0]+"\t"+r[i][1]+"\t"+r[i][2]+"\t"+g[i]);
		}
    }
}
