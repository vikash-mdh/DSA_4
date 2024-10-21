package TWODARRAY;

public class addtwomatrix {
        public static void main(String[] args) {
            // Define two 3x3 matrices
            int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[][] matrix2 = {
                    {4, 5, 8},
                    {0, 0, 8},
                    {1, 2, 0}
            };

            // Add the matrices and store the result in matrix1
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix1[i][j] += matrix2[i][j];  // Add corresponding elements and store in matrix1
                }
            }

            // Print the result (matrix1 now holds the sum)
            System.out.println("Resultant Matrix (matrix1 + matrix2):");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

