import java.util.*;
public class VotingEligibility2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=10;
		
		// Applying the required logic
        int[] ages=generateAges(n);
        String[][] result=checkEligibility(ages);
        display(result);
        sc.close();
    }

    // Method to Generate random 2-digit ages
    static int[] generateAges(int n){
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=(int)(Math.random()*90)+10;
		}
        return a;
    }

    // Method to Check eligibility
    static String[][] checkEligibility(int[] ages){
        String[][] r=new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
            r[i][0]=String.valueOf(ages[i]);
            if(ages[i]>=18){
				r[i][1]="true";
			}else{
				r[i][1]="false";
			}
        }
        return r;
    }
	
	// Method to display results
    static void display(String[][] a){
        System.out.println("Age\tCanVote");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i][0]+"\t"+a[i][1]);
		}
    }
}
