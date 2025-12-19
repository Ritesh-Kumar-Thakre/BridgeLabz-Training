import java.util.*;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;

        // Applying the required logic
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Printing reversed number using array
        System.out.println("Reversed number is:");
		for (int i = 0; i < count; i++) {
			System.out.print(digits[i]);
		}
        sc.close();
    }
}
