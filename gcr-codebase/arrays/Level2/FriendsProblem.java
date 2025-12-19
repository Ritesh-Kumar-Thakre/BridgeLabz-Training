import java.util.*;
public class FriendsProblem{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Initialize Array's and Variable's
		int friends=3;
		String name[]={"Amar","Akbar","Anthony"};
		int age[]=new int [friends];
		int height[]= new int[friends];
		int youngestIndex=0;
		int tallestIndex=0;
		
		// Applying the required logic
		System.out.println("Enter age and height of all friends:");
		for(int i =0;i<friends;i++){
			age[i]=sc.nextInt();
			height[i]=sc.nextInt();
		}
		for(int i =0;i<friends;i++){
			if(age[i]<age[youngestIndex]){
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
		}
		
		// Printing the results
		System.out.println("The youngest friend is "+name[youngestIndex]);
		System.out.println("The tallest friend is "+name[tallestIndex]);
		sc.close();
	}
}