package BINARYSERCH;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class lowerbound {
    public static void lowerbond(int arr[], int tar){
        int low = 0;
        int high = arr.length-1;
        int lb = arr.length;
        while (low <= high){
            int mid = low +(high - low)/2;
            if(arr[mid] >= tar){
                lb = Math.min(lb,mid);
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        System.out.print("the lower bound index is  "+ lb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght");
        int n = sc.nextInt();
        System.out.println("Enter the arrays");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        lowerbond(arr,target);

    }
}
