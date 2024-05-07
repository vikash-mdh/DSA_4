package MATH;

import java.util.Scanner;

        public class Factorial_number {
            public  static long Factorial(long n) {
                long fac = 1l;
                for (int i = 1; i <= n; i++) {
                    fac = fac * i;
                }
                return fac;
            }
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

           long fact = Factorial(n);
                System.out.println(fact);

        }
    }

