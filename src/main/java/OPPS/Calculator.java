package OPPS;

class calcul {
    // method ovaeloding but same type diffrent argument count
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public void add(int a, int b, int c, int d, int e) {
        System.out.println(a + b + c + d + e);
    }
}
    class advanceCalc{
        public void add(int... args ){
        int sum = 0;
        for(int data : args){
            sum += data;
        }
            System.out.println(sum);
        }

    }


public class Calculator {
    public static void main(String[] args) {
        calcul ca = new calcul();
        ca.add(10,20);
        ca.add(10,20,30);
        ca.add(10,20,30,40);
        ca.add(10,20,30,40,50);
        System.out.println();
        advanceCalc ad = new advanceCalc();
        ad.add();
        ad.add(30);
        ad.add(10,20);
        ad.add(10,20,30);
        ad.add(10,20,30,40);
        ad.add(10,20,30,40,50);


    }
}
