package STRING;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String str = "raghav";
        char[] ch = str.toCharArray();
        for(char ele : ch){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
