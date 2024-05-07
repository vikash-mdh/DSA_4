package MATH;


import java.util.Scanner;
 public class Sum_Number {
     public  static int sum_num(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        return sum;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sum_num(n);
        System.out.println(sum);
    }
}
