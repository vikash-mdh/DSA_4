package PATTERN;

import java.util.Scanner;

public class rombous {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for(int  i  = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" " + " ");

            }
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
