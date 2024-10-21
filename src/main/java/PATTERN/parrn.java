package PATTERN;

import java.util.Random;
import java.util.Scanner;

public class parrn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//         // ---------- 1 assiment -------

//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        // ---------- 2 assiment -------

//        for(int i = n; i >= 0; i--){
//            for(int j = 1; j <=i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        // --- ----- 3 assiment -------------

//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <=i; j++){
//                System.out.print((char) (j+64) + " ");
//            }
//            System.out.println();
//        }

        //--------- 4 assiment -----------
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <=i; j++){
//                if(i%2 == 0)
//                System.out.print((char) (j+64) + " ");
//                else
//                    System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // 5 assiment

        // outer loop upper side
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//       }
//        // inner loop inner side
//        for(int i = n-1; i >= 1; i--){
//            for(int j = 1; j <=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // ------ 6 assiment -----

//        for ( int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0 || i == n - 1
//                        || j == n - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // ------- 7 assiment --------
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //  --------- 8 assiment --------
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        //  -------- 9 assiment ---------
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print((char)(j+64) + " ");
//            }
//            System.out.println();
//        }
        // ---------- 10 assiment ---------
//        for (int i = 1; i <= n; i++) {
//            // inner loop to print the spaces
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }

        // ---------- 11 assiment ---------
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//       }
//        // inner loop inner side
//        for(int i = n-1; i >= 1; i--){
//            for(int j = 1; j <=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // 12 assiment quction
//        int i, j;
//        for (i = 1; i <= n; i++) {
//            // inner loop to print spaces
//            for (j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            // inner loop to print stars
//            for (j = 1; j <= 2 * i - 1; j++) {
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }

        // 13 ----- assiment quction -------
//        int i, j;
//        for (i = 1; i <= n; i++) {
//            // inner loop to print spaces
//            for (j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            // inner loop to print stars
//            for (j = 1; j <= 2 * i - 1; j++) {
//                System.out.print((char)(j+64) +" ");
//            }
//            System.out.println();
//        }

        // ----------- 14 assiment --------
//         int i, j;
//        for (i = 1; i <= n; i++) {
//            // inner loop to print spaces
//            for (j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            // inner loop to print stars
//            for (j = 1; j <= 2 * i - 1; j++) {
//                System.out.print((char)(j+64) +" ");
//            }
//            System.out.println();
//        }

        // --------  17 assimnet -------
//        int i, j, k;
//        for (i = 1; i <= n; i++) {
//            for (j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (k = 1; k <= (2 * i - 1); k++) {
//                // printing stars.
//                if (k == 1 || k == (2 * i - 1) ) { // || i == n
//                    System.out.print("*");
//                }
//                // printing spaces.
//                else {
//                    System.out.print(" ");
//                }
//            }System.out.println("");
//        }




        // 18 assiment
//        int i, j, k;
//        for (i = 1; i <= n; i++) {
//            for (j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (k = 1; k <= (2 * i - 1); k++) {
//                // printing stars.
//                if (k == 1 || k == (2 * i - 1) ) { // || i == n
//                    System.out.print("*");
//                }
//                // printing spaces.
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
//
//        for (i = n; i >= 0; i--) {
//            for (j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (k = 1; k <= (2 * i - 1); k++) {
//                // printing stars.
//                if (k == 1 || k == (2 * i - 1) ) { // || i == n
//                    System.out.print("*");
//                }
//                // printing spaces.
//                else {
//                    System.out.print(" ");
//                }
//            }System.out.println("");
//        }
// ---------  19 assiment --------
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || k == (2 * i - 1) ) { // || i == n
                    System.out.print(i);
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }



    }
}


