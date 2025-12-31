/*17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.*/

import java.util.*;
public class QuizApplication{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		String questions[] = {"Which team has won the most IPL titles?",
							"Who is the highest run scorer in IPL history?",
							"Which bowler has taken the most wickets in IPL?",
							"Who was the winner of the first IPL season (2008)?",
							"Which player is known as Mr. IPL?"};
		String options[] = {"1. Mumbai Indians, 2. RCB, 3. Kolkata Knight Riders, 4. Sunrisers Hyderabad",
							"1. Rohit Sharma, 2. Virat Kohli, 3. David Warner, 4. MS Dhoni",
							"1. Yuzvendra Chahal, 2. Lasith Malinga, 3. Amit Mishra, 4. Ravichandran Ashwin",
							"1. Chennai Super Kings, 2. Kings XI Punjab,3. Rajasthan Royals, 4. Delhi Daredevils",
							"1. MS Dhoni, 2. AB de Villiers, 3. Rohit Sharma, 4. Suresh Raina"};
		int answers[] = {1,2,1,3,4};
		int score=0;
		int ans=0;
		
		System.out.println("---------- Welcome in the Quiz ----------");
		for(int i =0;i<questions.length;i++){
			System.out.println("\nQuestion "+(i+1)+": "+questions[i]);
			System.out.println("Options "+options[i]);
			System.out.println("Enter you answer:");
			ans=sc.nextInt();
			 switch(ans){
				 case 1:
				 case 2:
				 case 3:
				 case 4:
					if(ans==answers[i]){
						score+=10;
						System.out.println("\nCorrect answer");
					}else{
						System.out.println("\nWrong answer");
					}
					break;
				 default:
					System.out.println("Invalid option — Answer counted as wrong ");
			 }
		}
		System.out.println("\nTotal score: "+score);
	}
}