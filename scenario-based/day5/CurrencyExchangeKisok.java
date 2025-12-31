/*18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/

import java.util.*;
public class CurrencyExchangeKisok{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String currencys []={"USD","EUR","GBP","AUD","JPY"};
		double value[]={82.5,91.3,106.2,55.2,0.58};
		String ask="";
		
		// Applying the required logic for conversion
		System.out.println("Welcome in Currency Exchange Kisok");
		do{
			System.out.println("\nEnter amount in INR:");
			double amount=sc.nextDouble();
			System.out.println("\nEnter currency to convert:");
			for(int i=0;i<currencys.length;i++){
				System.out.print(currencys[i]+" ");
			}
			System.out.println();
			String conversion=sc.next();
			switch(conversion){
				case "USD":
				System.out.println("\nyou get "+(amount/value[0])+" "+currencys[0]);
				break;
				case "EUR":
				System.out.println("\nyou get "+(amount/value[1])+" "+currencys[1]);
				break;
				case "GBP":
				System.out.println("\nyou get "+(amount/value[2])+" "+currencys[2]);
				break;
				case "AUD":
				System.out.println("\nyou get "+(amount/value[3])+" "+currencys[3]);
				break;
				case "JPY":
				System.out.println("\nyou get "+(amount/value[4])+" "+currencys[4]);
				break;
				default:
				System.out.println("\nSorry this currency cannot be converted");
				
			}
			System.out.println("you want another conversion ? Enter (yes/no)");
			ask=sc.next();
		}while(ask.equals("yes"));
		System.out.println("Thank you for using Currency Exchange Kiosk!");
	}
}
