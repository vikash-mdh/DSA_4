package PATTERN;

import java.util.Scanner;

public class pta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i % 2 == 1){
                    System.out.print(j+" ");
                }else {
                    System.out.print( (char) (j + 64)+" ");

                }

            }
            System.out.println();
        }
    }
}
