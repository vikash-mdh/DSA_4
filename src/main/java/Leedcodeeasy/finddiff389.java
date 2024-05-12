package Leedcodeeasy;

import java.util.Scanner;

public class finddiff389 {
    public  static char findTheDifference(String s, String t) {

//        ------- approch1 --------1
//        char result = '\0';
//        // XOR all characters in s and t
//        for (int i = 0; i < s.length(); i++) {
//            result ^= s.charAt(i);
//            result ^= t.charAt(i);
//        }
//        // XOR the last character in t
//        result ^= t.charAt(t.length() - 1);
//        return result;

//        ---------approch2-------

//        char result = 0;
//        for (char c : s.toCharArray()) {
//            result ^= c;
//        }
//        for (char c : t.toCharArray()) {
//            result ^= c;
//        }
//        // The result will be the added letter
//        return result;

//        --------approch3------
        int sum = 0;
        for (char ch : t.toCharArray()) {
            sum += ch;
        }
        for (char ch : s.toCharArray()) {
            sum -= ch;
        }
        return (char) (sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1  = sc.nextLine();
        String str2 = sc.nextLine();
        char res = findTheDifference(str1, str2);
        System.out.println(res);
    }
}
