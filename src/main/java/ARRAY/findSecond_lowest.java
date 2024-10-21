package ARRAY;

import java.util.Scanner;

public class findSecond_lowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        int smin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] != min)
                smin = Math.min(smin, arr[i]);
        }
        System.out.println(smin);
    }
}
