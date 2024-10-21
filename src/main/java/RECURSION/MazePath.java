package RECURSION;

import java.util.Scanner;

public class MazePath {
//    public static int maze(int row, int col, int n, int m){
//        if(row == m || col == n) return 1;
//        int right = maze(row, col+1,m, n);
//        int left = maze(row+1,col,m,n);
//        return right+left;
//    }
    public static int maze2(int n, int m){
        if(m == 1 || n == 1) return 1;
        int right = maze2(m, n-1);
        int left = maze2(m - 1,n);
        return right+left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = sc.nextInt();
        System.out.println("Enterthe number m ");
        int m =  sc.nextInt();
//        System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m,n));
    }
}
