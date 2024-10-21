package STRING;

import java.util.Scanner;

public class ReverseSecondHalf {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string of even length: ");
        String input = sc.nextLine();

        // Check if the string length is even
        if (input.length() % 2 != 0) {
            System.out.println("The string length is not even.");
        } else {
            int mid = input.length() / 2;

            // First half remains the same
            String firstHalf = input.substring(0, mid);

            // Reverse the second half
            String secondHalf = new StringBuilder(input.substring(mid)).reverse().toString();

            // Combine first half and reversed second half
            String result = firstHalf + secondHalf;

            // Output the result
            System.out.println("Resulting string: " + result);
        }

        sc.close();
    }
}
