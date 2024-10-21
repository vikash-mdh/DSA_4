package STRING;

public class conatins_startwith {
    public static void main(String[] args) {
        String str = "physics walla skills";
        System.out.println(str.contains("alla"));
        System.out.println(str.contains("icss"));
        System.out.println(str.startsWith("phy"));
        System.out.println(str.endsWith("ills"));
    }
}
