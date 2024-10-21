package RECURSION;

public class Stringres {
    public static void printt(int i, String str){
        if(i == str.length())return;
        System.out.print(str.charAt(i)+" ");
        printt(i + 1, str);
    }
    public static void main(String[] args) {
    String str = "vikash";
    printt(0,str);
    }
}
