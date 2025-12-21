import java.util.*;
public class FriendsProblem{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int friends=3;
		String name[]={"Amar","Akbar","Anthony"};
		int age[]=new int [friends];
		int height[]= new int[friends];
		
		// Applying the required logic
		System.out.println("Enter age and height of all friends:");
		for(int i =0;i<friends;i++){
			System.out.println(name[i]+":");
			age[i]=sc.nextInt();
			height[i]=sc.nextInt();
		}
		
		// Printing the results
		System.out.println("the youngest friend is: "+name[youngest(age,friends)]);
		System.out.println("the tallest friend is: "+name[tallest(height,friends)]);
		sc.close();
	}
	
	// Method to find the youngest
	public static int youngest(int age[],int length){
		int youngestIndex=0;
		for(int i =0;i<length;i++){
			if(age[i]<age[youngestIndex]){
                youngestIndex = i;
            }
		}
		return youngestIndex;
	}
	
	// Method to find the tallest
	public static int tallest(int height[],int length){
		int tallestIndex=0;
		for(int i =0;i<length;i++){
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
		}
		return tallestIndex;
	}
}