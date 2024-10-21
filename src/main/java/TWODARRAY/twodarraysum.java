package TWODARRAY;

public class twodarraysum {
    public static void main(String[] args){
                int[][] matrix = {
                        {1, 1, 2, 2},
                        {1, 2, 2, 4},
                        {1, 2, 3, 4},
                        {1, 4, 1, 2}
                };

                int sum = 0;
                int col = matrix[0].length - 1;  // Fix: subtract 1 to get the last valid column index

                for (int row = 0; row < 4; row++) {
                    sum = sum + matrix[row][col];  // Sum up the elements from the last column
                }

                System.out.println("Sum of the last column: " + sum);
            }
        }


 