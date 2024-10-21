package ARRAY;

import java.util.Scanner;

public class uniquenumber {

        // Method to find the unique element in the array
        public static int findUnique(int[] array) {
            int unique = 0;

            // XOR all the elements of the array
            for (int num : array) {
                unique ^= num;  // XOR operation
            }
            return unique;  // The unique number will remain
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();// Example array where 2 is the unique element
            int array[] = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = sc.nextInt();
            }

            // Find and print the unique element
            int uniqueElement = findUnique(array);
            System.out.println("The unique element is: " + uniqueElement);
        }
    }


