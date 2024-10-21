package PATTERN;
import java.util.*;
public class onepattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 0; j <= n; j++){
            for(int i = 1; i <= j; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
