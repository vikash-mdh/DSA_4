package ARRAY;

import java.util.Scanner;

public class sum_of_array {
    // Method to calculate the sum of elements in an array
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int sum = sumArray(array);
        System.out.println("The sum of the array elements is: " + sum);
        sc.close();
    }


}
