package ARRAY;

import java.util.Scanner;

public class duplicate_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }
        boolean isDuplicateFound = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] +" ");
                    isDuplicateFound = true;
                    break;  // Optional: To avoid printing the same duplicate more than once
                }
            }
        }

        if (!isDuplicateFound) {
            System.out.println("No duplicates found.");
        }
    }
}
