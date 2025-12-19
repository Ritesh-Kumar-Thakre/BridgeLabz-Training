import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int[] frequency = new int[10];

        // Applying the required logic
		int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            frequency[digit]++;
            temp = temp / 10;
        }

        // Printing the results
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
        sc.close();
    }
}

