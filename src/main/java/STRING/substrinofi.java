package STRING;
// what is substring  continious  part of substring is called substring
public class substrinofi {
    public static void main(String[] args) {
//        String str = "abcde";
//        System.out.println(str.substring(2)); // print the agge ka 2 index substring wala
//        System.out.println(str.substring(1,5)); // this is the part of sting i and j print the value print the value
        String str = "abcde";
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }


    }
}
