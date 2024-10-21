package RECURSION;

import java.util.Scanner;

public class Arraytraversalrecursion {
    public static void printt(int i, int arr[] ){
        if(i == arr.length) return;
        System.out.print(arr[i]+" ");
        printt(i+1,arr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i = 0; i < n; i++){
//            sc.nextInt();
//        }
        printt(0, arr);
    }
}
