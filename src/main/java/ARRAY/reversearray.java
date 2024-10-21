package ARRAY;

import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//        for(int i = 0; i < n/2; i++){
//            int temp = arr[i];
//            arr[i] = arr[n-1-i];
//            arr[n-1-i] = temp;
//        }
        // two pointer technich
        int i = 0, j = n-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for(int k = 0; k < n; k++){
            System.out.print(arr[k] +" ");
        }
    }
}
