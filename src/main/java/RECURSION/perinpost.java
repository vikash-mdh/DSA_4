package RECURSION;

import java.util.Scanner;

public class perinpost {
    public static void prepo(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        prepo(n-1);
        System.out.print(n+" ");
        prepo(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        prepo(n);


    }
}
