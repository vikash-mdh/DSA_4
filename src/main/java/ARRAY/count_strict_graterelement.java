package ARRAY;

import java.util.Scanner;

public class count_strict_graterelement {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                // Take the size of the array
                System.out.println("Enter the size of the array:  ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                // Take the array elements as input
                System.out.println("Enter the array elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                // Take the value of x
                System.out.println("Enter the value of x:");
                int x = sc.nextInt();
                // Call the method to count elements greater than x
                int count = countGreaterThanX(arr, x);
                // Output the result
                System.out.println("Number of elements strictly greater than " + x + ": " + count);
            }
            // Method to count the number of elements strictly greater than x
            public static int countGreaterThanX(int[] arr, int x) {
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > x) {
                       //  System.out.println(arr[i]);
                        count++;
                    }
                }
                return count;
            }
        }


