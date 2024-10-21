package ARRAY;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int[] array) {
        int start = 0;
        int end = array.length - 1;
        // Compare elements from start and end
        while (start < end) {
            if (array[start] != array[end]) {
                return false;  // If any pair doesn't match, it's not a palindrome
            }
            start++;
            end--;
        }

        return true;  // If all elements match, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        // Check if the array is a palindrome
        if (isPalindrome(array)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}
