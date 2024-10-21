package OPPS;
class plane{
    public void Takeoff(){
        System.out.println("plane is take of........!");
    }
    public void fly(){
        System.out.println("plane is faliying........!");
    }
    public void lande(){
        System.out.println("plane is landing..........!");
    }
}
class passangerplane extends plane{

    public void Takeoff(){
        System.out.println("passanger_plane is take of..........!");
    }
    public void fly(){
        System.out.println("passanger_plane is faliying.........!");
    }
    public void lande(){
        System.out.println("passanger_plane is landing...........!");
    }
}
class cargoplane extends plane{
    public void Takeoff(){
        System.out.println("cargo_plane is take of...........!");
    }
    public void fly(){
        System.out.println("cargo_plane is faliying...........!");
    }
    public void lande(){
        System.out.println("cargo_plane is landing...........!");
    }
}
class Fighterplane extends plane{
    public void Takeoff(){
        System.out.println("fighter_plane is take of..........!");
    }
    public void fly(){
        System.out.println("fighter_plane is faliying.........!");
    }
    public void lande(){
        System.out.println("fighter_plane is landing..........!");
    }
}
class Airpot{
    public void allowplane(plane p ){
        // true polymoriphisn
        p.Takeoff();
        p.fly();
        p.lande();
       // System.out.println("Enter the new line");
    }
}
public class planea {
    public static void main(String[] args) {
       passangerplane p = new passangerplane();
       cargoplane q = new cargoplane();
       Fighterplane r = new Fighterplane();

       Airpot ar = new Airpot();
        System.out.println();
       ar.allowplane(p);
        System.out.println();
       ar.allowplane(q);
        System.out.println();
       ar.allowplane(r);
    }
}
