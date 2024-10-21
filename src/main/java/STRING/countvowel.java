package STRING;

import java.util.Scanner;

public class countvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        int n = str.length();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(isVowel(ch)== true)
                cnt++;

        }
        System.out.println(cnt);

    }

    public static boolean isVowel(char ch){
      if(ch == 'a' || ch == 'A') return true;
      if(ch == 'e' || ch == 'E') return true;
      if(ch == 'i' || ch == 'I') return true;
      if(ch == 'o' || ch == 'O') return true;
      if(ch == 'u' || ch == 'U') return true;

        return  false;

    }
}
