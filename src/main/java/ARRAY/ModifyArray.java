package ARRAY;

import java.util.Scanner;

public class ModifyArray {
    // Method to modify the array based on index
        public static void modifyArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    // Increment even-indexed elements by 10
                    array[i] += 10;
                } else {
                    // Change odd-indexed elements to their second multiple
                    array[i] *= 2;
                }
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int array[] = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = sc.nextInt();
            }
            // Modify the array
            modifyArray(array);

            // Print the modified array
            System.out.println("Modified array:");
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }

