package STRING;

public class append {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("abc");
        System.out.println(sc);
        sc.append(34);
        System.out.println(sc);
        sc.append("*");
        System.out.println(sc);
        sc.append("deepak");
        System.out.println(sc);
        int arr[] = {1,2,3,4,5,6};
        sc.append(arr);
        System.out.println(sc); // dose not work address is append
    }
}
