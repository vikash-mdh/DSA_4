package SORT;
import java.util.*;

public class Selectionsort {
        static void selection_sort(int arr[], int n) {
            for (int i = 0; i < n - 1; i++) {
                int mini = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[mini]) {
                        mini = j;
                    }
                }
                //swap
                int temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;
            }

            System.out.println("After selection sort:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String args[]) {

            int arr[] = {13, 46, 24, 52, 20, 9};
            int n = arr.length;
            System.out.println("Before selection sort:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            selection_sort(arr, n);
        }
    }


//        Example 1:
//        Input: N = 6, array[] = {13,46,24,52,20,9}
//        Output: 9,13,20,24,46,52
//        Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52
//
//        Example 2:
//        Input: N=5, array[] = {5,4,3,2,1}
//        Output: 1,2,3,4,5
//        Explanation: After sorting the array is: 1, 2, 3, 4, 5

