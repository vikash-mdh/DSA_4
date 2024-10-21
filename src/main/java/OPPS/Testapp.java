package OPPS;


class Account{
    // data security
    private double blance;

    // method public
    public double getBlance( double blance){
       // withdrawing the money
        boolean result = validate("lusi", "lusi@123");
        if(result == true){
            // deposite the money
            this.blance = this.blance - blance;
            System.out.println("widroling"+ blance+"Account");
        }else{
            // throw a meaningful message to the user
            System.out.println("Invalide username/ password try again");

        }
        return blance;
    }



    // method :: public
    public void setBlance(double blance){
     // deposite the money
       boolean result =  validate("lusi", "lusi@123");
       if(result == true){
           // deposite the money
           this.blance = this.blance + blance;
           System.out.println("Credit the blance your account");
       }else{
           // throw a meaningful message to the user
           System.out.println("Invalide username/ password try again");

       }


    }

    // method private
    private boolean validate(String userName, String password){
      // logic for authntication
        return userName.equalsIgnoreCase("lusi")
                &&password.equals("lusi@1234");

    }
}
public class Testapp {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBlance(1000.0);
        double blance = acc.getBlance(500.0);
        System.out.println("witdrawing " + blance + "  Account");


    }
}
