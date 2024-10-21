package RECURSION;

public class functionCall {
    public static void patato(){
        System.out.println("i am a patato");
    }
    public static void tamato(){
        patato();
        System.out.println("i am a tamato");

    }
    public static void apple(){
        tamato();
        System.out.println("i am a apple");
        patato();

    }
    public static void main(String[] args) {
        System.out.println("i am a main method");
        apple();
    }
}
