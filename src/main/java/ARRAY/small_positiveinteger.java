package ARRAY;

import java.util.Scanner;
 // Q5.WAP to find the smallest missing positive element in the sorted Array. (take the array as input)
public class small_positiveinteger {
    public static void main(String[] args) {
           int[] sub = new int[50];
            for (int i = 0; i <= 48; i++) {
                sub[i] = i;
                System.out.println(sub[i]);
            }
            //To find the smallest missing positive integer in a sorted array where all values
        // from 0 to 48 are present, the smallest missing positive integer would be 49.
        // This is because the array includes all integers from 0 to 48, so the next
        // smallest positive integer, which is 49, is missing.


    }
}
