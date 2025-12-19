import java.util.*;

public class LargestDigits2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Applying the required logic
        while (number != 0) {
            int digit = number % 10;
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index++] = digit;
            number = number / 10;
        }
        for (int i = 0; i < index; i++) {
            if (digits[i] > firstMax) {
                secondMax = firstMax;
                firstMax = digits[i];
            } else if (digits[i] > secondMax && digits[i] != firstMax) {
                secondMax = digits[i];
            }
        }

        // Printing the results
        System.out.println("The largest digit is " + firstMax);
        System.out.println("The second largest digit is " + secondMax);
        sc.close();
    }
}
