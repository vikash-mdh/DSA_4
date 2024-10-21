package ARRAY;

import java.util.Scanner;

public class EvenOddIndexDifference {
    public static int findDifference(int[] array) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenSum += array[i];  // Add element at even index
            } else {
                oddSum += array[i];   // Add element at odd index
            }
        }
        return evenSum - oddSum;  // Return the difference
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        // Find and print the difference
        int difference = findDifference(array);
        System.out.println(difference);
    }
}
