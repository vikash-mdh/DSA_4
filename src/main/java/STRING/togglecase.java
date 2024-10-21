package STRING;

import java.util.Scanner;

public class togglecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for(int i = 0; i< n; i++){
            char ch = sb.charAt(i);
            int asc = (int)ch;
            if(asc >= 65 && asc <= 90){
                asc += 32;
                 ch = (char) asc;
                 sb.setCharAt(i,ch);
            }
            else if(asc >= 97 && asc <= 122){
                asc -= 32;
                ch = (char) asc;
                sb.setCharAt(i,ch);
            }
        }
        System.out.println();

    }
}
