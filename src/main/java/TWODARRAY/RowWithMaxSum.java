package TWODARRAY;

import java.util.Scanner;

public class RowWithMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the matrix from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Get the matrix elements from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Find the row with the maximum sum
        int rowIndex = findRowWithMaxSum(matrix);
        System.out.println("The row with the maximum sum is: " + rowIndex);

        // Close the scanner
        scanner.close();
    }

    // Method to find the row with the maximum sum
    public static int findRowWithMaxSum(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        int rowWithMaxSum = -1;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            // Check if this row has the maximum sum
            if (rowSum > maxSum) {
                maxSum = rowSum;
                rowWithMaxSum = i;
            }
        }

        return rowWithMaxSum;
    }
}
