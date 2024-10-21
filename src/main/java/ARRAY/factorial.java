package ARRAY;
import java.math.BigInteger;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();  // Input number
        // Call the factorial method
            BigInteger result = factorial(number);
            // Print the result
            System.out.println("Factorial of " + number + " is: " + result);
        }

        // Method to calculate factorial using BigInteger
        public static BigInteger factorial(int n) {
            BigInteger fact = BigInteger.ONE;  // Initialize result as 1

            // Multiply from 1 to n
            for (int i = 2; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }

            return fact;
        }
    }


