package ARRAY;

import java.util.Scanner;

public class lineraserch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        System.out.println("Enter the length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Array element the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        if(flag == true)
            System.out.println("ELement found");
        else
            System.out.println("Element not found");

}
}
