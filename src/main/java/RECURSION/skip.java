package RECURSION;

public class skip {
    public static void printt(int i, String str, String ans ){
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }
        if(str.charAt(i) != 'a')
            ans += str.charAt(i);
        printt(i + 1, str, ans);
    }
    public static void main(String[] args) {
        String str = "raghav kumar";
        printt(0,str, "");
    }
}
