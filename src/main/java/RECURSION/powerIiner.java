package RECURSION;

import java.util.Scanner;

public class powerIiner {
    public static int pow(int a, int b){
        if(b == 0) return 1;
        //if(a == 1) return 1;

       return a * pow(a, b-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base");
        int a = sc.nextInt();
        System.out.println("Enter the power");
        int b = sc.nextInt();
        System.out.println(a + "raise to the power b "+b+" is :- "+  pow(a,b));

    }
}
