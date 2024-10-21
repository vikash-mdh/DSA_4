package TWODARRAY;

public class towdmatrix {
        public static void main(String[] args) {
            // Declare a 5x5 matrix
            int[][] matrix = new int[5][5];

            // Loop through each row
            for (int i = 0; i < 5; i++) {
                // Loop through each column
                for (int j = 0; j < 5; j++) {
                    // Set the value at each position to 10
                    matrix[i][j] = 10;
                }
            }

            // Print the matrix
            System.out.println("Matrix filled with 10:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


