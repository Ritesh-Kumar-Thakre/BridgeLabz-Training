import java.util.*;
public class FootballTeam{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int players=11;
        double heights[]=new double[players];
		
        // Applying the required logic 
		System.out.println("Rendom heights are:");
		for (int i=0; i<heights.length;i++) {
			System.out.println(Math.ceil((heights[i]=(Math.random()*101) +150)* 100) / 100);
		}
		double sum=sum(heights);
		double mean = mean(players,sum);
		int tallest=tallest(heights);
		int shortest=shortest(heights);
			
		// Printing results
		System.out.println("Sum of all heights are: "+Math.ceil(sum*100)/100);
		System.out.println("Mean height of the players on the football team is: "+Math.ceil(mean*100)/100);
		System.out.println("The shortest height of the player on the football team is : "+Math.ceil(heights[shortest]*100)/100);
		System.out.println("The tallest height of the player on the football team is: "+Math.ceil(heights[tallest]*100)/100);
        sc.close();
    }

    // Method to find the sum of all the elements present in the array
    public static double sum(double heights[]){
        double sum=0;
        for(int i =0;i<heights.length;i++){
			sum+=heights[i];
		}
		return sum;
    }
	
	// Method to find the mean height of the players on the football team
    public static double mean(int length,double sum){
        double mean=sum/length;
		return mean;
    }
	
	// Method to find the shortest height of the players on the football team 
    public static int shortest(double heights[]){
		int idx=0;
        for(int i =0;i<heights.length;i++){
            if (heights[i] < heights[idx]) {
                idx = i;
            }
		}
		return idx;
    }
	
	// Method to find the tallest height of the players on the football team
    public static int tallest(double heights[]){
		int idx=0;
        for(int i =0;i<heights.length;i++){
            if (heights[i] > heights[idx]) {
                idx = i;
            }
		}
		return idx;
    }
}