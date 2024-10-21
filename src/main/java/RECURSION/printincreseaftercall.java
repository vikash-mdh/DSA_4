package RECURSION;

import java.util.Scanner;

public class printincreseaftercall {
    public static void printinc(int n){
        if(n == 0) return;
        printinc(n - 1);
        System.out.print(n  +" ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        printinc(n);
    }
}
