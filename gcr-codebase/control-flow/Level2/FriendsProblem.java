import java.util.*;
public class FriendsProblem{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs
		System.out.println("Enter Amar, Akbar, and Anthony's ages:");
		int amarAge=sc.nextInt();
		int akbarAge=sc.nextInt();
		int anthonyAge= sc.nextInt();
		String youngest ="";
		System.out.println("Enter Amar, Akbar, and Anthony's heights:");
		int amarHeight=sc.nextInt();
		int akbarHeight=sc.nextInt();
		int anthonyHeight=sc.nextInt();
		String tallest = "";
		
		// Applying the required logic
		if((amarAge<akbarAge&&amarAge<anthonyAge)&&(amarHeight>akbarHeight&&amarHeight>anthonyHeight)){
			youngest="Amar";
			tallest="Amar";
		}else if((akbarAge<anthonyAge&&akbarAge<amarAge)&&(akbarHeight>anthonyHeight&&akbarHeight>amarHeight)){
			youngest="Akbar";
			tallest="Akbar";
		}else if((anthonyAge<amarAge&&anthonyAge<akbarAge)&&(anthonyHeight>akbarHeight&&anthonyHeight>amarHeight)){
			youngest="Anthony";
			tallest="Anthony";
		}
		
		// Printing the results
		System.out.println("The youngest friend is "+youngest);
		System.out.println("The tallest friend is "+tallest);
		sc.close();
	}
}