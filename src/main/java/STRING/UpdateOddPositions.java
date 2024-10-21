package STRING;

import java.util.Scanner;

public class UpdateOddPositions {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert the string to a character array for easy manipulation
        char[] charArray = input.toCharArray();

        // Update characters at odd indices
        for (int i = 1; i < charArray.length; i += 2) {
            charArray[i] = '#';
        }

        // Convert the modified character array back to a string
        String updatedString = new String(charArray);

        // Output the updated string
        System.out.println("Updated string: " + updatedString);

        sc.close();
    }
}
