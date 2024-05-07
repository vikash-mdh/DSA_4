package PATTERN;
import java.util.*;
public class Pattern_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}

//input: - 5
// output
//        0
//        1 1
//        2 3 5
//        8 13 21 34
//        55 89 144 233 377
