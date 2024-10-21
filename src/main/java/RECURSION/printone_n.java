package RECURSION;

import java.util.Scanner;

public class printone_n {
    static int n;
    public static void print(int x){
        if(x > n) return;

        System.out.print(x+" ");
        print(x+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        print(1);



    }
}
