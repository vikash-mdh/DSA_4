package MATH;
 import java.util.*;
public class Prime_Factors {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    printPrimeFactors(n);
}

    public static void printPrimeFactors(int n) {
        // Print 2 as a factor while n is divisible by 2
        while (n % 2 == 0) {
            System.out.print("2"+" ");
            n /= 2;
        }

        // Print other prime factors
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i+" ");
                n /= i;
            }
        }

        // If n becomes a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }

    }
}

