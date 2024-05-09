package ARRAY;

import java.util.Scanner;

public class multi_of_array {
    public static int multi(int[] arr){
        int mult = 1;
        for(int num : arr){
            mult *= num;
        }
        return mult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int mul = multi(arr);
        System.out.println(mul);

    }
}
