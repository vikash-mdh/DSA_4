package TWODARRAY;

import java.util.Scanner;

public class LargestIn2DArrayWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the 2D array from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the 2D array
        int[][] array = new int[rows][cols];

        // Get the array elements from the user
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                array[i][j] = scanner.nextInt();
            }
        }

        // Find the largest element
        int largest = findLargestElement(array);
        System.out.println("The largest element in the 2D array is: " + largest);

        // Close the scanner
        scanner.close();
    }

    // Method to find the largest element in the 2D array
    public static int findLargestElement(int[][] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        return max;
    }
}

