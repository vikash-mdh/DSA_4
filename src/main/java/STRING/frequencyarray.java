package STRING;

import java.util.Scanner;

public class frequencyarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int [] fre = new int[26];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int idx = (int)ch-97;
            fre[idx]++;
        }

        int maxfre = -1;
        for(int i = 0; i < fre.length; i++){
            maxfre = Math.max(maxfre,fre[i]);
        }

        for(int i = 0; i < fre.length; i++){
            if(fre[i] == maxfre){
                char ch = (char)(i+97);
                System.out.println(ch);
            }


        }


    }
}
