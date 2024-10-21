package SORTINGALGORITHM;

import java.util.Scanner;

public class merg2SortedArrays {
    public static void printt(int arr[], int n, int m){
        int l = arr.length;
        int array[] = new int [n+m];
        for(int i = 0; i < n; i++){
            
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the frist array length ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the second Arrays length");
        int m =  sc.nextInt();
        int arr1 [] = new int[m];
        for(int j = 0; j < m; j++){
            arr1[j] = sc.nextInt();
        }

  }
}
