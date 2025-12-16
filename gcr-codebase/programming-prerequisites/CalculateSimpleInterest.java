import java.util.*;
public class CalculateSimpleInterest{
	public static int simpleInterest(int principal, int rate,int time){
		int si= (principal*rate*time)/100;
		return si;
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int principal=sc.nextInt();
		int rate=sc.nextInt();
		int time=sc.nextInt();
		System.out.println(simpleInterest(principal,rate,time));
	}

}