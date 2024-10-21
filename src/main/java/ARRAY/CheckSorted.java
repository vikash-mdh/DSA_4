package ARRAY;

import java.util.Scanner;

public class CheckSorted {
    // Method to check if array is sorted in ascending order
        public static boolean isSorted(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                // If the current element is greater than the next one, the array is not sorted
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
            return true;  // Array is sorted
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();

            }
            // Check if the array is sorted
            if (isSorted(array)) {
                System.out.println("The array is sorted.");
            } else {
                System.out.println("The array is not sorted.");
            }
        }
}


