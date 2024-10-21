package OPPS;

class Student{
    // datasecurity
     private int rolln;
     private String name;
     private String address;

     // setter method


    public int getRolln() {
        return rolln;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setRolln(int rolln) {
        this.rolln = rolln;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
public class StudentApp {
    public static void main(String[] args) {
     Student s1 = new Student();
     s1.setRolln(101);
     s1.setName("vikash");;
     s1.setAddress("madhubani, bihar");
        System.out.println("my self is "+ s1.getName());
        System.out.println("my roll number is this" + s1.getRolln());
        System.out.println("my address is this "+ s1.getAddress());
    }
}
