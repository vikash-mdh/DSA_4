package RECURSION;

import java.util.Scanner;

public class sum_paramater {
    public static void print_sum(int n, int s){
        if(n == 0){
            System.out.println(s);
            return;
        }
        print_sum(n -1, s + n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        print_sum(n,0);
    }
}
