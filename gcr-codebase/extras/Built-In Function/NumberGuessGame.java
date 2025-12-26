import java.util.*;
public class NumberGuessGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Computer will try to guess it.");
        int low = 1, high = 100;

		// Applying the required logic and printing the results
        while(true){
            int guess = generateGuess(low,high);
            System.out.println("Computer guesses: " + guess);
            String feedback = getFeedback(sc);
            if(feedback.equals("correct")){
                System.out.println("Computer guessed it right 🎯");
                break;
            }
            else if(feedback.equals("high")){
                high = guess - 1;
            }
            else if(feedback.equals("low")){
                low = guess + 1;
            }
            else{
                System.out.println("Invalid feedback. Type high/low/correct.");
            }
        }
        sc.close();
    }
	
	// Method to generate guess
	 static int generateGuess(int low,int high){
        return low + (int)(Math.random() * (high - low + 1));
    }
	
	//Method to get feedback
    static String getFeedback(Scanner sc){
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.next().toLowerCase();
    }

}
