package BINARYSERCH;

import java.util.Scanner;

public class basicSearching {
     static  void Searching(int [] arr, int tar){
        //int n = arr.length-1;
        int low = 0;
        int high = arr.length -1;
        boolean flag = false;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == tar){
                flag = true;
                break;
            } else if (arr[mid] > tar) {
                high = mid-1;
            }else if(arr[mid] < tar){
                low = mid+1;
            }
        }
        if(flag == true){
            System.out.println("find the element");
        }else {
            System.out.println("Element not found");
        }

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

        Searching(arr,target);

    }
}
