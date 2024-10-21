package STRING;
import java.util.Scanner;

public class ConsonantCounter {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert input string to lowercase for easy comparison
        input = input.toLowerCase();

        // Initialize a consonant count variable
        int consonantCount = 0;

        // Loop through the string to check each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a consonant (not a vowel, space, or non-letter character)
            if (ch >= 'a' && ch <= 'z' && !isVowel(ch)) {
                consonantCount++;
            }
        }

        // Output the consonant count
        System.out.println("Number of consonants: " + consonantCount);

        sc.close();
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
