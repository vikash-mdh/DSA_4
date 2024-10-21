package STRING;

import java.util.Scanner;

public class convertString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
       // String str = " " + n;
        String str = Integer.toString(n);
        System.out.println(str);
        System.out.println(str.length()-1);

    }
}
