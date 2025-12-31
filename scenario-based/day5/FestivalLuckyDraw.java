/*20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/

import java.util.*;
public class FestivalLuckyDraw{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int gifts=30;
		int draw=0;
		
		// Applying the required logic
		System.out.println("Welcome to Lucky Draw");
		while(true){
			if(gifts<1){
				return;
			}
			System.out.println("\nEnter your name:");
			String visitor=sc.next();
			System.out.println("\nPress D to draw:");
			char ch=sc.next().charAt(0);
			if(ch=='D'){
				draw=(int)(Math.random()*100)+1;
				if(draw%3==0||draw%5==0){
					System.out.println("\n"+visitor+" Congratulations you win a gift.");
				}else{
					System.out.println("\n"+visitor+" Better lock next time.");
				}
			}else{
				System.out.println("\nDraw failed:");
			}
		}
	}
}