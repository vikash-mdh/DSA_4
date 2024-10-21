package ARRAY;

import java.util.Scanner;

public class swapcodearray {
    public static void main(String[] args) {
       int arr[] = new int[26];
        arr[0] = 100;
        arr[25] = 200;

        int temp = arr[0];
        arr[25] = arr[0];
         arr[0] = temp;
        System.out.print(arr[0] +" "+ arr[25]);


    }
}
