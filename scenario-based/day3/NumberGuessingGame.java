import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number=(int)(Math.random()*100)+1;
		int attempts=0;
		int guess=0;
		
		do {
			System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if(guess < number) {
                System.out.println("Too low");
            }else if(guess > number) {
                System.out.println("Too high");
            }else {
				System.out.println("Correct guess!");
                System.out.println("You guessed it in " + attempts + " attempts.");
                break;
            }

		} while(attempts < 5);

        if(attempts == 5 && guess != number) {
            System.out.println("\nGame Over — You used all attempts.");
            System.out.println("The correct number was: " + number);
        }
	}
}