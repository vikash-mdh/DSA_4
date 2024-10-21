package OPPS;

class animals{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleeps(){
        System.out.println("Animals is sleeping");
    }
}
class Monkey extends  animals{
    public void eat(){
        System.out.println("monkey is eating");
    }
    public void sleeps(){
        System.out.println("monkey is sleeping");
    }

}
class Deer extends animals{
    public void eat(){
        System.out.println("Deer is eating");
    }
    public void sleeps(){
        System.out.println("Deer is sleeping");
    }

}
class Lione extends animals{
    public void eat(){
        System.out.println("Lione is eating");
    }
    public void sleeps(){
        System.out.println("lione is sleeping");
    }

}
class forest{
    public void animafor(animals animals){
        animals.sleeps();
        animals.eat();

    }
}
public class testttt {
    public static void main(String[] args) {
        forest f = new forest();
        f.animafor(new Monkey());
        f.animafor(new Deer());
        f.animafor(new Lione());

    }
}
