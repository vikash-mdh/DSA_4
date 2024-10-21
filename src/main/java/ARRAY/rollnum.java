package ARRAY;

import java.util.Scanner;

public class rollnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = sc.nextInt();
        int arr[] = new int [100];
        for(int i = 0; i < n; i++){
             arr[i] = sc.nextInt();
        }
        for(int j = 0; j < n; j++){
            if(arr[j] < 30)
            System.out.print(j+" ");
        }

    }
}
