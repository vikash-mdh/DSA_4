package SORT;

public class Bubblesort {
    static void bubble_sort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr, n);
    }
}

//        Example 1:
//        Input: N = 6, array[] = {13,46,24,52,20,9}
//        Output: 9,13,20,24,46,52
//        Explanation: After sorting we get 9,13,20,24,46,52
//
//
//        Input: N = 5, array[] = {5,4,3,2,1}
//        Output: 1,2,3,4,5
//        Explanation: After sorting we get 1,2,3,4,5

