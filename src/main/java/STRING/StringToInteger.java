package STRING;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string of digits (length less than 10): ");
        String input = sc.nextLine();

        // Check if the string length is valid
        if (input.length() >= 10) {
            System.out.println("String length is greater than or equal to 10. Please enter a valid string.");
        } else {
            // Convert string to integer manually
            int number = 0;
            boolean isNegative = false;
            int start = 0;

            // Check for negative numbers
            if (input.charAt(0) == '-') {
                isNegative = true;
                start = 1; // Start from the next character after '-'
            }

            for (int i = start; i < input.length(); i++) {
                // Get the integer value of the character
                int digit = input.charAt(i) - '0';

                // Multiply the current number by 10 and add the new digit
                number = number * 10 + digit;
            }

            // If the number is negative, make the result negative
            if (isNegative) {
                number = -number;
            }

            // Output the resulting integer
            System.out.println("Converted integer: " + number);
        }

        sc.close();
    }
}
